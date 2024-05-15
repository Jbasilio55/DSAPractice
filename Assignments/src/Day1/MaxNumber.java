package Day1;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        //initialize scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Large number checker ----");

        //enter first number
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        //enter second number
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        //show the largest number
        if(num1 > num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
}
