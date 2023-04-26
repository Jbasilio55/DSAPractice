public class Search2DMatrix {
    public static void main(String[] args) {
        //You are given an m x n integer matrix matrix with the following two properties:
        //
        //Each row is sorted in non-decreasing order.
        //The first integer of each row is greater than the last integer of the previous row.
        //Given an integer target, return true if target is in matrix or false otherwise.
        //
        //You must write a solution in O(log(m * n)) time complexity.
        //
        //
        //Example 1:
        // [01, 03, 05, 07]
        // [10, 11, 16, 60]
        // [23, 30, 34, 60]

        //Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
        //Output: true

        //Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
        //Output: false

        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };

        System.out.println(searchMatrix(arr, 3));
        System.out.println(searchMatrix(arr, 13));
    }

    public static boolean searchMatrix(int[][] matrix, int target){
        // If the size of matrix is 0. Always return false
        if (matrix.length == 0) {
            return false;
        }

        int col = matrix[0].length - 1;
        int row = 0;

        // Loop through elements of Matrix
        // Until the target is found

        while (col >= 0 && row <= matrix.length - 1) {
      /*
        Cases:
          target == item : We found the item. Return true.
          target < item : Target must be to our left...go down in value
          target > item : Target must be to our below...go up in value
      */
            if (target == matrix[row][col]) {
                return true;
            } else if (target < matrix[row][col]) {
                col--;
            } else if (target > matrix[row][col]) {
                row++;
            }
        }

        // Target is not available in the matrix
        return false;
    }
}
