package binarySearchAlgorithm;

import org.junit.jupiter.api.Test;

import static binarySearchAlgorithm.InfiniteArrayBinarySearch.infiniteBinarySearch;
import static org.junit.jupiter.api.Assertions.*;

class InfiniteArrayBinarySearchTest {

    @Test
    void infiniteBinarySearchTest() {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        int answer = infiniteBinarySearch(arr, target);
        assertEquals(4, answer);
    }
}