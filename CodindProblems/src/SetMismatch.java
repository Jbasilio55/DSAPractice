//https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        //645. Set Mismatch
        //
        //You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately,
        // due to some error, one of the numbers in s got duplicated to another number in the set, which results
        // in repetition of one number and loss of another number.
        //
        //You are given an integer array nums representing the data status of this set after the error.
        //
        //Find the number that occurs twice and the number that is missing and return them in the form of an array.
        //
        //Example 1:
        //
        //Input: nums = [1,2,2,4]
        //Output: [2,3]
        //
        //Example 2:
        //
        //Input: nums = [1,1]
        //Output: [1,2]

        int[] arr = {1,2,2,4};
        int[] arr2 = {1, 1};

        System.out.println(Arrays.toString(findErrorNums(arr)));
        System.out.println(Arrays.toString(findErrorNums(arr2)));
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        int correct;
        int temp;

        while(i < nums.length){
            correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                return new int[]{nums[index], index + 1};
            }
        }
        return new int[]{-1, -1};
    }
}
