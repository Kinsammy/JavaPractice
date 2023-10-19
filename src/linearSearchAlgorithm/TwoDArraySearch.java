package linearSearchAlgorithm;

import java.util.Arrays;

public class TwoDArraySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 41, 31},
                {14, 43, 55},
                {15, 44, 21}
        };

        int target = 21;
        int[] ans = binarySearch(arr, target);

        System.out.println(Arrays.toString(ans));
        System.out.println("The Max number is " + searchMaxElement(arr));
    }

    public static int[] binarySearch(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if (element == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int searchMaxElement(int[][] arr){
        int maxValue = arr[0][0];

        for (int row = 1; row < arr.length; row++) {
            for (int col = 1; col < arr[row].length; col++) {
                int element = arr[row][col];
                if (element > maxValue) {
                    maxValue = element;
                }
            }
        }
        return maxValue;
    }
}
