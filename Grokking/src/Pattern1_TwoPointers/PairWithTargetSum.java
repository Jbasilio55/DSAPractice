package Pattern1_TwoPointers;
// 1. Two Sum - Easy

// Given an array of numbers sorted in ascending order and a target sum, find a pair in the array whose sum is equal to the given target.
//
// Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target.
// If no such pair exists return [-1, -1].

// Ex. 1
//Input: [1, 2, 3, 4, 6], target=6
//Output: [1, 3]
//Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6

import java.util.HashMap;

public class PairWithTargetSum {
    // HashMap approach - Time O(n), Space O(N)
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>(); // to store numbers and indices
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(target - nums[i]))
                return new int[] { hash.get(target - nums[i]), i };
            else
                hash.put(nums[i], i); // put the number and its index in the map
        }
        return new int[] { -1, -1 }; // pair not found
    }

    // Two pointer approach - Time O(n * logN), Space O(1)
    public int[] twoSum1(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum == target)
                return new int[] { left, right }; // found the pair

            if (target > sum)
                left++; // we need a pair with a bigger sum
            else
                right--; // we need a pair with a smaller sum
        }
        return new int[] { -1, -1 };
    }

    //Brute Force - Time O(n^2), Space O(1)
    public int[] twoSum2(int[] nums, int target) {

        int size = nums.length;

        for (int i = 1; i < size; i++) {
            for (int j = i; j < size; j++) {
                if ( (nums[j] + nums[j-i]) == target) {
                    return new int[]{j, j-i}; // solution found
                }
            }
        }
        return new int[]{}; // solution not found
    }
}
