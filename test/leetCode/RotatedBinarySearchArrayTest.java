package leetCode;

import org.junit.jupiter.api.Test;

import static leetCode.RotatedBinarySearchArray.findPivot;
import static org.junit.jupiter.api.Assertions.*;

class RotatedBinarySearchArrayTest {

    @Test
    void findPivotTest() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int pivot = findPivot(arr);
        assertEquals(3, pivot);
    }
}