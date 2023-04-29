public class Main {
    public static void main(String[] args) {
        //Strings are immutable
        //must use double quotes

        String name = "Jorge";
        String name2 = "Jorge";

        String name3 = new String("Will");
        String name4 = new String("Will");

        // ( == ) comparator checks the value and reference
        // name and name2 is pointing to the same reference in Heap Pool
        if(name == name2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        // Since I made 2 Strings using -- new -- keyword the references were created outside the pool in heap memory
        if(name3 == name4){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        //( .equals ) will only check if the values are the same
        if(name3.equals(name4)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        System.out.println(name.charAt(0));
    }
}