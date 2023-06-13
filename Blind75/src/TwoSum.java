import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target1 = 9;

        int[] nums2 = {3,2,4};
        int target2 = 6;

        int[] nums3 = {3,3};
        int target3 = 6;

        System.out.println(Arrays.toString(twoSumBF(nums1, target1)));
        System.out.println(Arrays.toString(twoSumBF(nums2, target2)));
        System.out.println(Arrays.toString(twoSumBF(nums3, target3)));

        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
        System.out.println(Arrays.toString(twoSum(nums3, target3)));
    }

    //Brute force Method Complexity = Time : O(n^2) | Space: O(1)
    public static int[] twoSumBF(int[] nums, int target){
        //double for loop starting with first index -> last
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                //add element from i and j
                int currentSum = nums[i] + nums[j];
                //if current sum equals target return the indexes
                if(currentSum == target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    //HashMap method - Method Complexity = Time : O(1) | Space: O(n)
    public static int[] twoSum(int[] nums, int target){
        //make new hash map
        Map<Integer, Integer> numMap = new HashMap<>();
        //loop through the nums array
        for(int i = 0; i < nums.length; i++){
            //if map contains the keys of target - i return indexes
            if(numMap.containsKey(target - nums[i])){
                return new int[] {numMap.get(target - nums[i]), i};
            }
            // if (target - i) is not a key, then add it to the map.
            numMap.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}
