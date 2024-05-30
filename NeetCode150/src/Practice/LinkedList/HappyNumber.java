package Practice.LinkedList;
//202. Happy Number - Easy

import java.util.HashSet;

public class HappyNumber {

    //Brute Force approach
    public boolean isHappy(int n) {
        //create a new hash set
        HashSet<Integer> seen = new HashSet<>();

        //while n does not equal 1
        while(n != 1) {
            //find the total after squaring each digit
            //while n greater than 0 run code
            int total = 0;
            while(n > 0){
                //get digit
                int digit = n % 10;
                //square digit
                total += digit * digit;
                // number divide by 10 to get next digit
                n = n / 10;
            } // if number is already in set then return false
            if(!seen.add(total)){
                return false;
            }
            n = total; //set n to new number after squaring and adding the digits
        }
        //return true;
        return true;
    }

    // different approach
    public boolean isHappy2(int n) {
        //make two pointers
        int slow = n;
        int fast = n;
        //do while
        do{
            slow = findSquare(slow); // slow is square once
            fast = findSquare(findSquare(fast)); // fast is squared twice
        }while(fast != slow); //continue as long as fast and slow are not equal

        return slow == 1; // is the number happy or not
    }
    private int findSquare(int number){
        //answer
        int ans = 0;
        //while number is greater than 0
        while(number > 0){
            int rem = number % 10; //get digit to right  | ex. 29 = 2[9]
            ans+= rem*rem; // square the digit and add to answer | ans = 81 = 9*9
            number /= 10; // divide num by 10 to get next digit | ex. 29 / 10 = 2
        }
        return ans; //return answer
    }
}
