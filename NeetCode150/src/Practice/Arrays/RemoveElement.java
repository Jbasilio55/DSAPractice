package Practice.Arrays;

// Leetcode 27. Remove Element

public class RemoveElement {
    public static void main(String[] args) {
        int test1[] = {3,2,2,3};
        int val1 = 3;

        int test2[] = {0,1,2,2,3,0,4,2};
        int val2 = 2;

        System.out.println(removeElement(test1, val1));
        System.out.println(removeElement(test2, val2));
    }

    public static int removeElement(int[] nums, int val) {

        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
