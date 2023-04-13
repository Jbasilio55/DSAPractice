import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ArrayList are Dynamic (adjust in size)
        // (1) Internally size are fixed
        // (2) If arraylist fills to a certain amount usually
        // (3) It will make a new arraylist from 1.5 to 2 times the size of the old arraylist
        // (4) It will then copy the elements of the old arraylist to the new arraylist
        // (5) Then the old arraylist is deleted

        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(55);
        list.add(98);
        list.add(30);
        list.add(23);
        list.add(4);
        list.add(568);
        list.add(500000);

        System.out.println(list);

        System.out.println(list.contains(34));
        System.out.println(list.set(0, 100));
        System.out.println(list);

        System.out.println(list.remove(2));
        System.out.println(list);

        //input size of the arraylist
        int size = sc.nextInt();

        //input
        for(int i = 0; i < size; i++){
            list.add(sc.nextInt());
        }

        System.out.println(list);

        //get items from list using loops
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }

        sc.close();
    }
}
