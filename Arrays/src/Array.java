import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Array {
    private int[] items;
    private int count = 0;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item){
        if(count == items.length){
            //create new array
           int[] newArray = new int[count * 2];
            //copy items from old array to new array
           for(int i  = 0; i < count; i++){
               newArray[i] = items[i];
           }
            //reassign old variable to new array
           items = newArray;
        }

        items[count++] = item;
    }

    //exercise 4- Extend the Array class and add a new method to insert an item at a
    //given index: public void insertAt(int item, int index)

    public void insertAt(int idx, int item){
        if(idx > count){
            System.out.println("sorry index is out of bounds");
        }else{
            items[idx] = item;
        }
    }

    public void remove(){
        items[count] = 0;
        count--;
    }

    public void removeAt(int idx){
        if(idx >= count || idx < 0){
            throw new IllegalArgumentException();
        }

        for(int i = idx; i < count - 1; i++)
            items[i] = items[i+1];

        count--;
    }

    public int indexOf(int num){
        for(int i = 0; i < count; i++){
            if(items[i] == num){
                System.out.println("idx:"+i+" = "+num);
                return i;
            }
        }
        return -1;
    }

    public void print(){
        System.out.print("[");
        for(int i = 0; i < count; i++){
            if(i == count - 1){
                System.out.print(items[i]);
                break;
            }

            System.out.print(items[i]+",");
        }
        System.out.println("]");
    }

    //exercises 1- Extend the Array class and add a new method to return the largest
    //number. What is the runtime complexity of this method?

    public int maxNum(){
        int max = -1;
        for(int i = 0; i < count; i++){
            if(items[i] > max){
                max = items[i];
            }
        }
        return max;
    }

    //exercise 2- Extend the Array class and add a method to return the common items
    //in this array and another array.

    public List<Integer> intersect(){
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        List<Integer> res = new ArrayList<>();

        for(int num : items){
            if(hash.containsKey(num)){
                hash.put(num, hash.getOrDefault(num, 0) + 1);
            }
        }

        for(int num: items){
            if(hash.containsKey(num) && hash.get(num) > 0){
               res.add(num);
               hash.put(num, hash.get(num) - 1);
            }
        }

        return res;
    }

    // exercise 3- Extend the Array class and add a method to reverse the array. For
    //example, if the array includes [1, 2, 3, 4], after reversing and printing it,
    //we should see [4, 3, 2, 1].
    public void reverse(){
        for(int i = 0; i < count / 2; i++){
            int temp = items[i];
            items[i] = items[count - i - 1];
            items[count - i - 1] = temp;

        }
    }


    public static void main(String[] args) {
        Array numbers = new Array(4);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(20);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insertAt(1, 40);
        numbers.removeAt(2);
        numbers.remove();
        numbers.print();
        numbers.reverse();
        numbers.print();
        System.out.println(numbers.intersect());
    }
}
