import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Why we need arrays? (a collection of a particular data type)
        //
        // Arrays are used to store multiple values in a single variable, instead of declaring separate variables
        // for each value.
        //
        // To declare an array, define the variable type with square brackets:
        //
        // ----- syntax ------
        // datatype[] variableName; <---declaration of array. (variableName) is getting defined in the stack
        //
        // datatype[] variableName = new datatype[size] <--- declaration and initialization. the object is being created in the memory (heap)

        //store 5 names:
        String[] names = new String[5];

        //names are added to names array
        names[0] = "Jorge";
        names[1] = "Tom";
        names[2] = "Jimmy";
        names[3] = "William";

        System.out.println(Arrays.asList(names));
        // all names are added and because the size is 5, the left over is null.
        // for integers arrays the unassigned elements will be set to 0.

        String[] newArr = {"hello", "hey", "hi", "hola"};

        //better way of writing arrays because you don't have to separately add the elements.
        // you can do all with in the braces {...} <--- elements must be of the same data type.

        //simplify
        int[] num; // (declaration) <--- declaring an array (num is getting defined in the stack)
        num = new int[3]; // (initialization) <---- object is being created in the memory.

               int[] needALongerName = new int[3];
        //       |        |                 |
        //       |        |                 |
        //       v        v                 v
        // (datatype) (ref variable) (creating obj in heap memory)
        //
        //  int[]  needALongerName  ---> occurs during compilation
        //  new int[3]              ---> occurs during runtime - (Dynamic memory allocation)

        // in java
        // ( 1 ) array objects are in the heap
        // ( 2 ) heap objects are not continuous like C (it all depends on the JVM)
        // ( 3 ) DMA - Dynamic memory Allocation (Array obj in java may not be continuous as per Java Docs)
        // in many languages arrays are continuous

        // arrays have indexes  starting from 0 1 2 ... n
        // each index will have an element (data - all from same data type)

        System.out.println(names[0]);
        // names[0] ---> will return the first element
        // you can change an element in an array by assigning a new value to that index.

        names[0] = "Kyle";
        System.out.println(names[0]);
    }
}