package easy;

import java.util.Arrays;

public class ConcatenationOfArray1929 {

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

