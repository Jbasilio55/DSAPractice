import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check idf its an ArmStrong Num: ");
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));

        sc.close();
    }

    private static boolean isArmstrong(int num) {

        int original = num;
        int sum = 0;

        while(num > 0){
            int lastDigit = num % 10;
            num /= 10;
            sum += Math.pow(lastDigit, 3);
        }
        return sum == original;
    }
}
