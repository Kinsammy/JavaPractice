package linearSearchAlgorithm;

public class RangeSearch {
    public static void main(String[] args) {
     int[] arr = {1, 2, 3, 6, 8};
     int target = 3;
        System.out.println(rangeOf4(arr, target, 1, 4));
        System.out.println(minElement(arr));
    }

    public static  int rangeOf4(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return 0;
    }

    public static int minElement(int[] arr) {
        int minNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minNum) {
                arr[i] = minNum;
            }
        }
        return minNum;
    }
}
