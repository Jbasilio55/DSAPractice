//https://leetcode.com/problems/first-missing-positive/

public class FirstMissingPositive {
    public static void main(String[] args) {
        //41. First Missing Positive
        //
        //Given an unsorted integer array nums, return the smallest missing positive integer.
        //
        //You must implement an algorithm that runs in O(n) time and uses constant extra space.
        //
        //Example 1:
        //
        //Input: nums = [1,2,0]
        //Output: 3
        //Explanation: The numbers in the range [1,2] are all in the array.
        //
        //Example 2:
        //
        //Input: nums = [3,4,-1,1]
        //Output: 2
        //Explanation: 1 is in the array but 2 is missing.
        //
        //Example 3:
        //
        //Input: nums = [7,8,9,11,12]
        //Output: 1
        //Explanation: The smallest positive integer 1 is missing.

        int[] arr = {1,2,0};
        int[] arr2 = {3,4,-1,1};
        int[] arr3 = {7,8,9,11,12};

        System.out.println(firstMissingPositive(arr));
        System.out.println(firstMissingPositive(arr2));
        System.out.println(firstMissingPositive(arr3));
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        int correct;
        int temp;

        while(i < nums.length){
            correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                return index + 1;
            }
        }
        return nums.length + 1;
    }
}
