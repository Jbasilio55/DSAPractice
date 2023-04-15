//(LEETCODE Q. 1295)
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        //Given an array nums of integers, return how many of them contain an even number of digits.
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums)); // count the even elements
        System.out.println(findNumbers2(nums)); // count the elements with even amount of digits
    }

    //Time Complexity = O(N)
    public static int findNumbers(int[] nums){
        //counter for even elements in array
        int counter = 0;

        // loop through nums arr
        for(int i = 0; i < nums.length; i++){
            // get last digit by % by dividing by 10
            int rem = nums[i] % 10;
            //if last digit is dividable by 2 its even
            if(rem % 2 == 0){
                //increment counter
                counter++;
            }
        }
        //return counter
        return counter;
    }

    public static int findNumbers2(int[] nums){
        int total = 0;

        for(int i = 0; i < nums.length; i++){
            int counter = 0;
            int currentElm = nums[i];

            while(currentElm > 0){
                currentElm /= 10;
                counter++;
            }

            if(counter % 2 == 0){
                total++;
            }
        }
        return total;
    }
}
