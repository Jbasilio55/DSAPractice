import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ArrayList of ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initialization
        for(int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }

        // add elements
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < 2; j++){
                //get arraylist at index (i) = arraylist <-- input chosen numbs
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);
        sc.close();
    }
}
