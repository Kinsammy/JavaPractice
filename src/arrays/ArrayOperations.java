package arrays;

public class ArrayOperations {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        return sum;
    }
}
