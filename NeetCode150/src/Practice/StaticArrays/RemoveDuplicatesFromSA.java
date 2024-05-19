package Practice.StaticArrays;

// leetcode 26. Remove Duplicates from Sorted Array

public class RemoveDuplicatesFromSA {
    public static void main(String[] args) {
        int test1[] = {1,1,2};
        int test2[] = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(test1));
        System.out.println(removeDuplicates(test2));
    }

    public static int removeDuplicates(int[] nums) {
        //start at index 1
        int index = 1;

        //iterate through array
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){ // if element at i does not equal previous
                nums[index] = nums[i]; // assign iterated element with element at "index"
                index++; //increment index
            }
        }

        //return num od unique values - k
        return index;
    }
}
