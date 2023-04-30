public class NumbersExample {
    public static void main(String[] args) {
        // write a function that takes a number and prints it
        //prints first 5 numbers: 1 2 3 4 5

        number(5);

//            stack
//
//        |(number[1])|   ^  print(1)    |    n - 1 = 1   print(1)
//        |(number[2])|   |  print(2)    |    n - 1 = 2   print(2)
//        |(number[3])|   |  print(3)    |    n - 1 = 3   print(3)
//        |(number[4])|   |  print(4)    |    n - 1 = 4   print(4)
//        |(number[5])|   |  print(5)    v        n = 5   print(5)
//        |  (main)   |
//        |___________|
    }

    public static void number(int n){
        //5 4 3 2 1
        System.out.println(n);

        if(n > 1){
            number(n-1);
        }
        // 1 2 3 4 5
        System.out.println(n);
    }
}
