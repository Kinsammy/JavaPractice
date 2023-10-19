package leetCode;

public class EvenDigits {
    public static void main(String[] args) {
        int[] digits = {12, 345, 2, 6, 7896};
        System.out.println("Total Even digits "+ findEvenNumbers(digits));
        System.out.println(countDigits2(-78923));
    }

    private static int findEvenNumbers(int[] digits) {
        int evenCount = 0;

//        for (int digit : digits) {
//            if (evenNumbers(digit)){
//                evenCount++;
//            }
//        }

        for (int i = 0; i < digits.length; i++) {
            if (evenNumbers(digits[i])){
                evenCount++;
            }
        }

        return evenCount;
    }

    private static boolean evenNumbers(int number){
    int numberOfDigits = countDigits(number);
        return numberOfDigits % 2 == 0;
    }

//    Shortcut for counting numbers of digits
    static int countDigits2(int number){
        if (number < 0) {
            number *= -1;
        }
        return (int) (Math.log10(number) +1);
    }

    private static int countDigits(int number){
//        Converting Negative Number to Positive Number;
        if (number < 0) {
            number *= -1;
        }
        int count = 0;
        while (number > 0){
            count++;
            number /=10;
        }
        return count;
    }

}
