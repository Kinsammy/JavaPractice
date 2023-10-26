package binarySearchAlgorithm;

public class GreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'd', 'e'};
        char target = 'b';
        char result = getNextGreatestLetter(letters, target);
        System.out.println(result);

    }
    public static char getNextGreatestLetter(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
