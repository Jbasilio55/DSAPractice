public class RichestCustomerWealth {
    public static void main(String[] args) {
        //You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the customer has
        // in the bank. Return the wealth that the richest customer has.
        //
        //A customer's wealth is the amount of money they have in all their bank accounts.
        // The richest customer is the customer that has the maximum wealth.

        int[][] accounts = {{1,2,3},{3,2,1}};
        int[][] accounts2 = {{1,5},{7,3},{3,5}};
        int[][] accounts3 = {{2,8,7},{7,1,3},{1,9,5}};

        System.out.println(maximumWealth(accounts));
        System.out.println(maximumWealth(accounts2));
        System.out.println(maximumWealth(accounts3));

    }
    //Brute Force method O(n)^2
    public static int maximumWealth(int[][] accounts){
        //make a variable to store max num between all accounts
        int maxSum = 0;
        //create a variable for sum
        int sum;

        //loop through 2D array ([person][account])
        for(int person = 0; person <accounts.length; person++){
            //set sum to 0 after looping through each person
            sum = 0;
            for(int account = 0; account < accounts[person].length; account++){
                //add all element to sum
                sum += accounts[person][account];
            }
            //If sum is greater than Maximum
            if(sum > maxSum){
                //assign maxSum to be to new sum
                maxSum = sum;
            }
        }
        //Return Max Account Balance
        return maxSum;
    }
}
