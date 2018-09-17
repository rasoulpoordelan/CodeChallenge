
import java.util.*;

public class SelectionSort{
    
    public static int[] selectionSort(int[] arr) {
        int[] newArr = new int[arr.length];
        int length = arr.length;
        for (int y = 0; y < length; y++) {
            int minIndex = findMinIndex(arr);
            newArr[y] = arr[minIndex];
            arr = removeIndex(arr, minIndex);
        }   
        return newArr;
    }

    public static int findMinIndex(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }   
        return minIndex;
    }

    public static int[] removeIndex(int[] arr, int index) {
        int temp = arr[0];
        arr[0] = arr[index];
        arr[index] = temp;
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }
        return newArr;
    }

    public static void main (String[] args)
    {
        int[] unSortedList = {38, 82, 9, 12, 312, 36, 32, 1, 8, 7, 90, 1};
        int[] sortedList=selectionSort(unSortedList);
        System.out.println(Arrays.toString(sortedList));
    }
}