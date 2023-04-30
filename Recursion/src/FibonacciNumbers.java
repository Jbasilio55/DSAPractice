public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    public static int fibonacci(int num){

        //base case
        if(num < 2){
            return num;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
