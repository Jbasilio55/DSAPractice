import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
            A multidimensional array is basically an array of arrays.

            Arrays can have any number of dimensions. In this chapter, we will introduce the most common;
            two-dimensional arrays (2D).

            1 2 3
            4 5 6
            7 8 9

         */
        // [][] <--- [rows][columns]

        int[][] multi = new int[3][]; //It is mandatory to add the number of rows but not the num of columns

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] arr2D = {
                {1, 2, 3}, // 0th index
                {4, 5}, // 1st index
                {6, 7, 8, 9} // 2nd index -> arr2D[2] = {6, 7, 8, 9}
        };

        System.out.println(arr2D.length); // this will tell me how many rows.

        //input
        Scanner sc = new Scanner(System.in);

        for(int row = 0; row < arr2D.length; row++){
            //for each col in every row
            for(int col = 0; col < arr2D[row].length; col++){
                arr2D[row][col] = sc.nextInt();
            }
        }

        //output
        for(int row = 0; row < arr2D.length; row++){
            for(int col = 0; col < arr2D[row].length; col++){
                System.out.print(arr2D[row][col]+" ");
            }
            System.out.println();
        }

        // another way to out put arrays in 2-dimensional array
        for(int row = 0; row < arr2D.length; row++){
            System.out.println(Arrays.toString(arr2D[row]));
        }

        //for each for multi - D. array
        for(int[] a : arr2D){
            System.out.println(Arrays.toString(a));
        }

        sc.close();
    }
}
