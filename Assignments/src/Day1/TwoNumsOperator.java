package Day1;

import java.util.Scanner;

public class TwoNumsOperator {
    public static void main(String[] args) {
        // basic calculator
        System.out.println("---- Basic calculator ----");
        Scanner scanner = new Scanner(System.in);
        //ask user to input first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        //ask user to input second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        scanner.nextLine();

        //ask user to enter an operator
        System.out.print("What operation: ");
        String operator = scanner.nextLine();

        //num1 (/, +, -, %, *) num2
        if(operator.equals("/")){
            if(num1 == 0 && num2 == 0){
                System.out.println(0);
            } else if (num1 == 0) {
                System.out.println("Unable to divide 0");
            }else{
                System.out.println(num1 / num2);
            }
        } else if (operator.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operator.equals("%")) {
            System.out.println(num1 % num2);
        }else{
            System.out.println(num1 * num2);
        }
        scanner.close();
    }
}
