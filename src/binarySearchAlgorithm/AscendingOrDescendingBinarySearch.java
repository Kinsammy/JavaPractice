package binarySearchAlgorithm;

public class AscendingOrDescendingBinarySearch {
    public static void main(String[] args) {
        int[] arr = {21, 20, 19, 18, 17, 15, 14, 13,10, 9, 8, 7};
//        int[] arr = {1, 2, 4, 8, 17, 18, 19, 20, 22, 26, 28, 30};
        int target = 18;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        boolean isASC = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (isASC){
                if (target < arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid -1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
