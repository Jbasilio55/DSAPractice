package Practice.StaticArrays;

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
        // start at first index
        int index = 0;

        //iterate through array
        for(int i = 0; i < nums.length; i++){
            //if iterated element does not equal val
            if(nums[i] != val){
                //change element at index with iterated element
                nums[index] = nums[i];
                //increment index
                index++;
            }
        }
        //return index (number of non-val)
        return index;
    }
}
