package Day1;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if its an ArmStrong Num: ");
        int num = sc.nextInt();
        System.out.println(armstrong(num));

        sc.close();
    }

    private static boolean armstrong(int num){
        int num1 = num;
        int total = 0;

        while(num1 > 0){

            for(int i = 0; i < Integer.MAX_VALUE; i++){
                if(num1 == 0){
                    break;
                }

                int r = num1 % 10;

                double powerNum = Math.pow(r, 3);

                total += powerNum;
                num1 /= 10;
            }
            return total == num;
        }
        return false;
    }
}
