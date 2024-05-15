package Day1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        //initialize scanner
        Scanner scanner = new Scanner(System.in);

        //Interest ($) = Principle ($) + Years (T) + rate (%)
        System.out.print("What is the Principle ($): ");
        int principle = scanner.nextInt();
        System.out.print("How many Years (Y): ");
        int years = scanner.nextInt();
        System.out.print("What is the rate (%): ");
        double rate = scanner.nextDouble();

        //output interest
        double interest = principle * years * rate;
        System.out.println("The interest $"+interest);
    }
}
