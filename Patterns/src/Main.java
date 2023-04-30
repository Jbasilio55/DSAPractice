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
}