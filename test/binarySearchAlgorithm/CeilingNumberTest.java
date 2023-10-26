package binarySearchAlgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeilingNumberTest {

    @Test
    void getCeilingNumberTest() {
        int[] numbers = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = CeilingNumber.getCeilingNumber(numbers, target);
        assertEquals(5, ans);
    }

    @Test
    void ifTargetIsGreaterTheHighestNumberInTheArrayItShouldReturn_Minus1() {
        int[] numbers = {2, 3, 5, 9, 14, 16, 18};
        int target = 20;
        int ans = CeilingNumber.getCeilingNumber(numbers, target);
        assertEquals(-1, ans);
    }
}