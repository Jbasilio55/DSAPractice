//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;

public class FindFirstAndLastSortedArray {
    public static void main(String[] args) {
        //Given an array of integers nums sorted in non-decreasing order, find the starting and ending position
        // of a given target value.
        //
        //If target is not found in the array, return [-1, -1].
        //
        //You must write an algorithm with O(log n) runtime complexity.

        //Example 1:
        //
        //Input: nums = [5,7,7,8,8,10], target = 8
        //Output: [3,4]
        //Example 2:
        //
        //Input: nums = [5,7,7,8,8,10], target = 6
        //Output: [-1,-1]
        //Example 3:
        //
        //Input: nums = [], target = 0
        //Output: [-1,-1]

        int[] nums = {5,7,7,8,8,10};
        int[] nums2 = {};

        System.out.println(Arrays.toString(searchRange2(nums, 8)));
        System.out.println(Arrays.toString(searchRange2(nums, 6)));
        System.out.println(Arrays.toString(searchRange2(nums, 0)));
    }

    //Brute force approach. O(n)
    public static int[] searchRange(int[] nums, int target) {
        //create a start and end to keep track of the index
        int first = 0;
        int last = 0;

        //For loop since the loop is starting from start to end find the last index that is equivalent to target
        for(int i = 0; i < nums.length; i++){
            //if target = current set it to last
            if(target == nums[i]){
                last = i;
            }
            //start from back and go toward front, if current elem matches target assign it to first
            if(target == nums[nums.length - i - 1]){
                first = nums.length - i - 1;
            }
        }
        //return array with first and last index if they are greater than 0
        if(first > 0 || last > 0){
            return new int[]{first, last};
        }
        //else return [-1, -1]
        return new int[]{-1, -1};
    }

    public static int[] searchRange2(int[] nums, int target) {
        //make new array with start and end set to -1
        int[] ans = {-1, -1};

        //run the search method and pass array, target, and if we are looking for first element
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        //set index 0 to start and 1 to end
        ans[0] = start;
        ans[1] = end;

        //return answer
        return ans;
    }

    public static int search(int[] nums, int target, boolean firstIndex){
        // set answer to -1
        int ans = -1;

        //make start middle end for binary search
        int start = 0;
        int end = nums.length - 1;
        int middle;

        //run while loop as long as start is less than end
        while(start <= end){
            //declare middle
            middle = start + (end - start) / 2;

            //if target is less than middle
            if(target < nums[middle]){
                //set end to middle + 1
                end = middle - 1;
                //if target is greater than middle
            }else if(target > nums[middle]){
                //set start to middle + 1
                start = middle + 1;
            }else{
                //else set answer to middle
                ans = middle;
                //if we are searching for first index. run next binary search
                if(firstIndex){
                    //set end to middle - 1
                    end = middle - 1;
                }else{
                    //set start to middle + 1
                    start = middle + 1;
                }
            }
        }
        //return answer
        return ans;
    }
}
