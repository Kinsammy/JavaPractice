package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeakIndexInMountainArrayTest {

    @Test
    void peakIndexInMountainArrayTest() {
        int[] arr = {1,2, 3,4,5,6,4,3,2};
        int peakIndex = PeakIndexInMountainArray.peakIndexInMountainArray(arr);
        assertEquals(5, peakIndex);
    }
}