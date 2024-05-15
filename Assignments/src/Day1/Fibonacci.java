package Day1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //To calculate Fibonacci Series up to n numbers.
        //solve without recursive algo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Fibonacci number you want to calculate (n): ");
        int n = scanner.nextInt();

        //assign first numbers of the sequence
        int num1 = 1;
        int num2 = 1;

        //total = 0
        int total = 0;

        //if input equal 1 or 2 = 1
        if(n == 1 || n == 2){
            System.out.println(1);
            return;
        }

        //if the entered number is greater 3
        while(n > 3){

            //save num1 to temp
            int temp = num1;
            //assign num2 to num1
            num1 = num2;
            //num2 = temp + num2
            num2 = temp + num2;

            //decrement n - 1
            n--;

            //total = num1 + num2
            total = num2 + num1;
        }
        //show total
        System.out.println(total);
    }
}
