//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        //442. Find All Duplicates in an Array
        //
        //Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each
        // integer appears once or twice, return an array of all the integers that appears twice.
        //
        //You must write an algorithm that runs in O(n) time and uses only constant extra space.
        //
        //Example 1:
        //
        //Input: nums = [4,3,2,7,8,2,3,1]
        //Output: [2,3]
        //Example 2:
        //
        //Input: nums = [1,1,2]
        //Output: [1]
        //Example 3:
        //
        //Input: nums = [1]
        //Output: []

        int[] arr = {4,3,2,7,8,2,3,1};
        int[] arr2 = {1,1,2};
        int[] arr3 = {1};

        System.out.println(findDuplicates(arr));
        System.out.println(findDuplicates(arr2));
        System.out.println(findDuplicates(arr3));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        int correct;
        int temp;

        List<Integer> duplicates = new ArrayList<>();

        if(nums.length < 2){
            return duplicates;
        }

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
            if(nums[index] - 1 != index){
                duplicates.add(nums[index]);
            }
        }
        return duplicates;
    }
}
