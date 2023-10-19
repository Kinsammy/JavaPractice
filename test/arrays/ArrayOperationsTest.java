package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {
    @Test
    void sumTest() {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = ArrayOperations.sum(arr);
        assertEquals(15, sum);
    }
}