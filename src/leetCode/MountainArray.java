package leetCode;

public class MountainArray {
    public static void main(String[] args){

    }

    public int findMountainArray(int[] arr, int target){
        int peak = peakIndexMountainArray(arr);
        int firstHalf = orderAgnosticBinarySearch(arr, target, 0, peak);

        if (firstHalf != -1){
            return firstHalf;
        }

        return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length-1);
    }

    private int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return - 1;
    }

    private int peakIndexMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid +1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
