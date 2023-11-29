package binarySearchAlgorithm;

public class InfiniteArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        int answer = infiniteBinarySearch(arr, target);
        System.out.println(answer);

    }
    public static int infiniteBinarySearch(int[] arr, int target){
        int start = 0;
        int end =1;

        while (target > arr[end]){
            int newStart = end + 1;
//            todo -> double the side of the box
//            todo -> formula_____ end = end + (end - start + 1) * 2;
            end = end + (end - start + 1) * 2;
        }

        return binarySearch(arr, target, start, end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target){
                end = mid -1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
