package easy;

import java.util.Arrays;

public class NumberOfGoodPairs1512 {

    /**
     Given an array of integers nums, return the number of good pairs.
     A pair (i, j) is called good if nums[i] == nums[j] and i < j.

     Example 1:

     Input: nums = [1,2,3,1,1,3]
     Output: 4
     Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
     Example 2:

     Input: nums = [1,1,1,1]
     Output: 6
     Explanation: Each pair in the array are good.
     Example 3:

     Input: nums = [1,2,3]
     Output: 0
     */

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,1,1,3};
        System.out.println(numIdenticalPairsMyDecision(nums));
    }

    public static int numIdenticalPairsMyDecision(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    result++;
                }
            }
        }
        return result;
    }
}
