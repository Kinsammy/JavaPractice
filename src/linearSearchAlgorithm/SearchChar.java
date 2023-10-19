package linearSearchAlgorithm;

import java.util.Arrays;

public class SearchChar {
    public static void main(String[] args) {
        String name = "Char";
        char target = 'C';
        System.out.println(getChar(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    public static char getChar(String name, char target) {
        if (name.isEmpty()){
            return 0;
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target){
                return name.charAt(i);
            }
        }
        return 0;
    }
}
