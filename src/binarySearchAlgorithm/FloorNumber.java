package binarySearchAlgorithm;

public class FloorNumber {
    public static void main(String[] args) {

    }


    public static int getFloorNumber(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = start + (end - start) /2;

            if (target < numbers[mid]) {
                end = mid -1;
            } else if (target > numbers[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
