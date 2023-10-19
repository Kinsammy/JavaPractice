package linearSearchAlgorithm;

public class Target {
    public static void main(String[] args) {
        int[] numbers = {10, 43, 13, 35, 89, 90, 32, 45, 99,47};
        int target = 89;
        int ans = linearSearch(numbers, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return element;
            }
        }
        return -1;
    }
}
