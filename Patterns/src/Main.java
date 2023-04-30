public class Main {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern17(5);
        System.out.println();
        pattern28(5);
        System.out.println();
        pattern30(5);
        System.out.println();
        pattern31(5);
    }

    public static void pattern1(int n){
        //each line will be a row
        for(int row = 1; row <= n; row++){
            //for every row run the col
            for(int col = 1; col <= n; col++){
                System.out.print("*");
            }
            //When one row is printed, we need to add a new line
            System.out.println();
        }
    }

    public static void pattern2(int n){
        //each line will be a row
        for(int row = 1; row <= n; row++){
            //for every row run the col
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            //When one row is printed, we need to add a new line
            System.out.println();
        }
    }

    public static void pattern3(int n){
        //each line will be a row
        for(int row = 1; row <= n; row++){
            //for every row run the col
            for(int col = 1; col <= n - row + 1; col++){
                System.out.print("*");
            }
            //When one row is printed, we need to add a new line
            System.out.println();
        }
    }

    public static void pattern4(int n){
        //each line will be a row
        for(int row = 1; row <= n; row++){
            //for every row run the col
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }
            //When one row is printed, we need to add a new line
            System.out.println();
        }
    }

    public static void pattern5(int n){
        //each line will be a row
        for(int row = 0; row < 2 * n; row++){
            //for every row run the col
            int totalColsInRow = row > n ? 2 * n - row: row;
                for(int col = 0; col < totalColsInRow; col++){
                    System.out.print("*");
                }
            //When one row is printed, we need to add a new line
            System.out.println();
        }
    }

    public static void pattern17(int n){
        for(int row = 1; row <= n * 2; row++){

            int c = row > n ? 2 * n - row : row;

            for(int space = 0; space < n - c; space ++){
                System.out.print(" ");
            }
            for(int col = c; col >= 1; col--){
                System.out.print(col);
            }
            for(int col = 2; col <= c; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern30(int n){
        for(int row = 1; row <= n; row++){
            for(int space = 0; space < n - row; space ++){
                System.out.print(" ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col);
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pattern31(int n){
        for(int row = 0; row <= n - 1; row++){
            for(int col = n - row -1; col < 0;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}