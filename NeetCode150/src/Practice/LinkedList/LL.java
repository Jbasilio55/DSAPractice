package Practice.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Rob");
        list.add("Peter");
        list.add("Mary");
        list.add("John");
        list.add("Jack");
        list.add("Jane");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        Iterator it = list.iterator();
        while(it.hasNext()){
            if(it.next() == "John"){
                System.out.println("Found John");
            }
        }

        list.remove();
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
