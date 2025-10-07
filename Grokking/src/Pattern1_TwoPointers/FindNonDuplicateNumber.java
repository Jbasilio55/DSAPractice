package Pattern1_TwoPointers;

public class FindNonDuplicateNumber {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2}));
        System.out.println(removeDuplicates(new int[]{1,2,3}));
        System.out.println(removeDuplicates(new int[]{1}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,200,200,300,3000}));
    }

    public static int removeDuplicates(int[] nums) {
        int index = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
