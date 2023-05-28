import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 6};
        int target = 6;
        int[] input2 = {2, 5, 9, 11};
        int target2 = 11;
        System.out.println(Arrays.toString(BFTargetSum(input, target)));
        System.out.println(Arrays.toString(BFTargetSum(input2, target2)));

        System.out.println(Arrays.toString(TPTargetSum(input, target)));
        System.out.println(Arrays.toString(TPTargetSum(input2, target2)));
    }

    //Brute Force Method - Complexity: Time O(n^2) | Space O(1) Constant
    public static int[] BFTargetSum(int[] arr, int target){
        //loop through an array starting from index 0
        for(int i = 0; i < arr.length - 1; i++){
            //keep track of the sum
            int currentSum = 0;
            for(int j = i+1; j <= arr.length - 1; j++){
                //adds the element from the next index
                currentSum = arr[i] + arr[j];
                //if a sum does not equal, the target continues to check the other index
                if(currentSum == target){
                    //return indexes
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    //
    public static int[] TPTargetSum(int[] arr, int target){
        //set left and right pointers
        int left = 0, right = arr.length - 1;
        //keep track of current sum
        int currentSum = 0;

        //while right pointer is greater than left pointer
        while(left < right){
            //add the pointer to current sum (reassign)
            currentSum = arr[left] + arr[right];

            //if both pointers sum equals target return indexes
            if(currentSum == target){
                return new int[] {left, right};
            }else if(currentSum < target){ // if sum is less than target increment left pointer
                left++;
            }else{ // if sum is greater than target than decrement right pointer
                right--;
            }
        }
        //return [-1, -1] if not found
        return new int[]{-1, -1};
    }
}
