public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 3.141592f;
        System.out.printf("Formatted number is %.2f", a);
        System.out.println();

        //value is rounded up
        System.out.printf("The value of pie %.3f \n", Math.PI);

        System.out.printf("Hello my name is %s and I am %d years old \n", "Jorge", 33);
    }
}
