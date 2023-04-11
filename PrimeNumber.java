import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check if it is prime: ");
        int value = sc.nextInt();
        boolean answer = isPrime(value);
        System.out.println(answer);

        sc.close();
    }

    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        int n = 2;

        while(n * n <= num){
            if(num % n == 0){
                return false;
            }
            n++;
        }
        return n * n > num;
    }
}
