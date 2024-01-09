package easy;

import java.util.Arrays;

public class ConcatenationOfArray1929 {

    /**
     * Given an integer array nums of length n,
     * you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
     *
     * Specifically, ans is the concatenation of two nums arrays.
     *
     * Return the array ans.
     *
     * Example 1:
     * Input: nums = [1,2,1]
     * Output: [1,2,1,1,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
     * - ans = [1,2,1,1,2,1]
     */

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,1};
        System.out.println(Arrays.toString(getConcatenationMyDecision(nums)));
        System.out.println(Arrays.toString(getConcatenationBestDecision(nums)));


    }
    public static int[] getConcatenationMyDecision(int[] nums) {
        int[] result = new int[nums.length * 2];
        int j = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[j];
            if (j < nums.length - 1) {
                j++;
            } else {
                j = 0;
            }
        }
        return result;
    }

    public static int[] getConcatenationBestDecision(int[] nums) {
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            result[i+nums.length]=result[i]=nums[i];
        }
        return result;
    }
}

