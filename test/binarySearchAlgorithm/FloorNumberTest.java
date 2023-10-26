package binarySearchAlgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloorNumberTest {

    @Test
    public void getFloorNumberTest(){
        int[] numbers = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = FloorNumber.getFloorNumber(numbers, target);
        assertEquals(4, ans);
    }

}