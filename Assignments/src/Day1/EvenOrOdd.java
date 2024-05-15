package Day1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Even or Odd checker");
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
