
public class BinarySearch{
    
    public static Integer binarySearch(int[] list,int item) {
        int low = 0;
        int hight = list.length - 1;
        while (low <= hight) {
        int mid = low + hight;
        int guess = list[mid];

         if (guess == item) {
            return mid;
        }
            if (guess > item) {
                hight = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }
    public static void main (String[] args)
    {
        int [] sortedList={3,6,9,12,34,36,54,61,75,81,90,110};
        System.out.println(binarySearch(sortedList,12));
    }
}

