import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 34, 62, 56, 22},
                {10, 90, 99},
                {6, 89, 55, 32},
                {13, 28}
        };
        System.out.println(Arrays.toString(search(arr, 55)));
    }

    public static int[] search(int[][] arr, int target){
        //make a new array to store array of [row, col] of target
        int[] newArr = new int[2];

        //Double for loop
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                //if target is found store row and col in newArr
                if(arr[row][col] == target){
                    newArr[0] = row;
                    newArr[1] = col;
                }
            }
        }
        //return newArr
        return newArr;
    }
}
