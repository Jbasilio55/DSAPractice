import java.util.Arrays;
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 22;
        arr[1] = 45;
        arr[2] = 500;
        arr[3] = 16;
        arr[4] = 5;

        System.out.println(Arrays.toString(arr));


        //input using for loops
        for(int i = 0; i < arr.length; i++){
            //overwriting original numbs
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        // use for each loop to retrieve values
        for(int num : arr){ // for every element in the array print the element
            System.out.println(num); // num represents each element in the array
        }

        sc.close();
    }
}
