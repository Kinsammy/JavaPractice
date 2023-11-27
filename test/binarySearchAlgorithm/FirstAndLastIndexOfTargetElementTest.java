package binarySearchAlgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastIndexOfTargetElementTest {

    @Test
    void searchRangeTest() {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] ans = FirstAndLastIndexOfTargetElement.searchRange(nums, target);
        assertArrayEquals(new int[]{3, 4}, ans);
    }
}