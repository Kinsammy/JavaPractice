package leetCode;

import org.junit.jupiter.api.Test;

import static leetCode.RotatedBinarySearchArray.*;
import static org.junit.jupiter.api.Assertions.*;

class RotatedBinarySearchArrayTest {

    @Test
    void findPivotTest() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int pivot = findPivot(arr);
        assertEquals(3, pivot);
    }

    @Test
    void binarySearchTest() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        int ans = binarySearch(arr, target, 0, arr.length-1);
        assertEquals(2, ans);
    }

    @Test
    void findTargetIndexTest() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 4;
        int ans = findTargetIndex(arr, target);
        assertEquals(0, ans);
    }
}