package leetCode;

import org.junit.jupiter.api.Test;

import static leetCode.ArrayRotationCount.countArrayRotation;
import static org.junit.jupiter.api.Assertions.*;

class ArrayRotationCountTest {

    @Test
    void countArrayRotationTest() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int count = countArrayRotation(arr);
        assertEquals(4, count);
    }
}