//https://leetcode.com/problems/find-the-duplicate-number/

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        //Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
        //
        //There is only one repeated number in nums, return this repeated number.
        //
        //You must solve the problem without modifying the array nums and uses only constant extra space.
        //
        //Example 1:
        //
        //Input: nums = [1,3,4,2,2]
        //Output: 2
        //
        //Example 2:
        //
        //Input: nums = [3,1,3,4,2]
        //Output: 3

        int[] arr = {1,3,4,2,2};
        int[] arr2 = {3,1,3,4,2};

        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicate(arr2));
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        int correct;
        int temp;

        while(i < nums.length){
            if(nums[i] != i + 1){
                correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
}
