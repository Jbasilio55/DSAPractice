//(LEETCODE Q. 1295)
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        //Given an array nums of integers, return how many of them contain an even number of digits.
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums)); // count the even elements
        System.out.println(findNumbers2(nums)); // count the elements with even amount of digits
        System.out.println(findNumbers3(nums)); // count the total even # of digits of all elements in an array
        System.out.println(findNumbers4(nums)); // optimized method #2 using log10
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

    //Time complexity O(N)^2
    public static int findNumbers2(int[] nums){
        //initialize total and set to 0
        int total = 0;

        //Loop through array
        for(int i = 0; i < nums.length; i++){
            //Make a new counter (to keep track of digits for each element)
            int counter = 0;
            int currentElm = nums[i];

            //Loop through each element while current element is not zero
            while(currentElm > 0){
                //count digits
                counter++;
                // remove last digit from element
                currentElm /= 10;
            }
            //If the counter is dividable by 2, then element has an even num of digits
            // if so add 1 to total
            if(counter % 2 == 0){
                //increment + 1
                total++;
            }
        }
        //return total
        return total;
    }

    //Time Complexity O(N)^2
    private static int findNumbers3(int[] nums) {
        //create counter
        int counter = 0;

        //Loop through array
        for(int i = 0; i < nums.length; i++){
            //last digit variable will hold last digit for check
            int lastDigit;

            // assigning elem to variable
            int currentElm = nums[i];

            //get last digit while current element is greater than 0
            while(currentElm > 0){
                //assign last digit
                lastDigit = currentElm % 10;

                //check if last digit is even
                if(lastDigit % 2 == 0){
                    //if so increment counter
                    counter++;
                }
                //divide element by 10 to get the next right most digit
                currentElm /= 10;
            }
        }
        //return counter
        return counter;
    }

    private static int findNumbers4(int[] nums){
        //count total even
        int total = 0;

        //loop through array
        for(int i = 0; i < nums.length; i++){
            //Use log10 to get last 3 digits and then add 1 to fix digit count
            if((int)(Math.log10(nums[i])+1) % 2 == 0){
                //increment total
                total++;
            }
        }
        //return total
        return total;
    }
}
