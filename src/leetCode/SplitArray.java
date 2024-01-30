package leetCode;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 8, 10};
        int lowestSum = splitSumArray(arr, 2);
        System.out.println(lowestSum);
    }

    public static int splitSumArray(int[] nums, int m){
        int start = 0;
        int end = 0;
        todo -> make start to be largest element
        todo -> make end to be sum of all elements
        for (int index = 0; index < nums.length; index++) {
            start = Math.max(start, nums[index]);
            end += nums[index];
        }

//        todo -> apply binary search
        while (start < end) {
            int mid = start + (end - start) / 2;
// todo -> calculate how many pieces you can split the array into
//            todo -> check for the maximum sum
            int pieces = getPieces(nums, mid);
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;// here start == end
    }

    private static int getPieces(int[] nums, int mid) {
        int sum = 0;
        int pieces = 1; // at least we can split to one array
        for (int num : nums){
            if (sum + num > mid) {
//      todo -> You cannot add element to the existing elements, make another subarray
                sum = num;
                pieces ++;
            } else {
                sum +=num;
            }
        }
        return pieces;
    }
}
