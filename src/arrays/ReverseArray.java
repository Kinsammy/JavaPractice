package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
//        int[] array = {5,4,3,2,1};
//        System.out.println(Arrays.toString(reverseArray(array)));
        String name = "Yaba College of Technology";
        System.out.println(reverseStr(name));
    }

    public static int[] reverseArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < array[i]; j++) {
                if (array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static String reverseStr(String letters){
        int size = letters.length();
        char[] charArray = letters.toCharArray();

        for (int i = 0; i < size / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[size - i - 1];
            charArray[size - i - 1] = temp;
        }

        return new String(charArray);
    }

}
