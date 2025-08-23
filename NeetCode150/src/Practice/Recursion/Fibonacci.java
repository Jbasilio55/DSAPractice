package Practice.Recursion;

/**
 * @author Jorge Basilio
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    public static int fibo(int n) {
        //base condition
        if(n < 2){
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }
}
