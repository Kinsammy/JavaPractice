package binarySearchAlgorithm;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = CeilingNumber.getCeilingNumber(numbers, target);
        System.out.println(ans);
    }
    public static int getCeilingNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start) /2;

            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
