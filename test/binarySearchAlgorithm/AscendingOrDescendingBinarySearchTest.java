package binarySearchAlgorithm;

import org.junit.jupiter.api.Test;

import static binarySearchAlgorithm.AscendingOrDescendingBinarySearch.binarySearch;
import static org.junit.jupiter.api.Assertions.*;

class AscendingOrDescendingBinarySearchTest {

    @Test
    void binarySearchDescendingTest() {
        int[] arr = {21, 20, 19, 18, 17, 15, 14, 13,10, 9, 8, 7};
        int target = 18;
        int ans = binarySearch(arr, target);
        assertEquals(3, ans);
    }

    @Test
    void binarySearchAscendingTest() {
        int[] arr = {1, 2, 4, 8, 17, 18, 19, 20, 22, 26, 28, 30};
        int target = 18;
        int ans = binarySearch(arr, target);
        assertEquals(5, ans);
    }
}