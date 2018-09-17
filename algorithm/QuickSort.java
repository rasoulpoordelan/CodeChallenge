import java.util.*;

public class QuickSort{

    static void sort(int arr[], int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);
            sort(arr, start, pi - 1);
            sort(arr, pi + 1, end);
        }
    }

    static int partition(int arr[], int start, int end) {
        int pivot = arr[start];
        int i = start;
        for (int j = start + 1; j <= end; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = pivot;
        arr[start] = temp;
        return i;
    }  

    public static void main (String[] args)
    {
        int[] arr = {0, 5, 8, 1, 2, 6, 4, 0, 23, 34, 11, 2, 43, 4};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

