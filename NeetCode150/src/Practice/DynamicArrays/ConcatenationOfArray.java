package Practice.DynamicArrays;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] nums2 = {1,3,2,1};

        System.out.println(Arrays.toString(getConcatenation(nums)));
        System.out.println(Arrays.toString(getConcatenation(nums2)));
    }

    public static int[] getConcatenation(int[] nums) {
        //make new array as ans
        int[] ans = new int[nums.length * 2];

        //iterate through array
        for(int i = 0; i < nums.length; i++){
            //copy elements from nums from start and starting at middle
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}
