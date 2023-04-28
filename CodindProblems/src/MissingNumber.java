//https://leetcode.com/problems/missing-number/

public class MissingNumber {
    public static void main(String[] args) {
        //Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range
        // that is missing from the array.
        //
        //Example 1:
        //
        //Input: nums = [3,0,1]
        //Output: 2
        //Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number
        // in the range since it does not appear in nums.
        //
        //Example 2:
        //
        //Input: nums = [0,1]
        //Output: 2
        //Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number
        // in the range since it does not appear in nums.
        //
        //Example 3:
        //
        //Input: nums = [9,6,4,2,3,5,7,0,1]
        //Output: 8
        //Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number
        // in the range since it does not appear in nums.

        int[] arr = {4, 0, 2, 1};
        int[] arr2 = {3, 0, 1};
        int[] arr3 = {0,1};
        int[] arr4 = {9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(arr));
        System.out.println(missingNumber(arr2));
        System.out.println(missingNumber(arr3));
        System.out.println(missingNumber(arr4));
    }

    public static int missingNumber(int[] arr){
        int i = 0;
        int temp;
        int correct;

        while(i < arr.length){
            correct = arr[i];

            if(arr[i] < arr.length && arr[i] != arr[correct]){
                temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
        }

        for(int index = 0; index < arr.length; index++){
            if(index != arr[index]){
                return index;
            }
        }
        return arr.length;
    }
}
