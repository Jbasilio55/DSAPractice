public class Operators {
    public static void main(String[] args) {
        //ASCII unicode a = 97, b = 98 (97+98 = 195)
        System.out.println('a' + 'b');

        //concatenation
        System.out.println("a" + "b");

        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));

        //integer will be covered to Integer that will call to.string()
        //this is the same as after a few steps: "a" + "1"
        System.out.println("a" + 1);

    }
}
