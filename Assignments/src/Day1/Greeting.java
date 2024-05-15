package Day1;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        System.out.print("Name: ");

        String name = scanner.nextLine();

        System.out.println("Hello "+name+"!");
    }
}
