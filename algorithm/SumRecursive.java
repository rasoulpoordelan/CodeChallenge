
public class SumRecursive{
    
    public static int sum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return arr[0] + sum(removeIndex(arr, 0));
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
        int [] arr={3,6,20,12,34};
        System.out.println(sum(arr));
    }
}

