package Practice.Stacks;

import java.util.Arrays;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super(); // it will call CustomStack;
    }

    public DynamicStack(int size) {
        super(size); // it will call CustomStack(int size)
    }

    @Override
    public boolean Push(int item) {
        //This takes care of it if full
        if(this.isfull()){
            // double the array size
            int[] temp = new int[data.length * 2];

            //copy all previous items in new data structure
            for(int i =0; i < data.length; i++){
                temp[i] = data[i];
            }

            data = temp;
        }
        //At this point we are aware that the array is not full
        //insert item
        return super.Push(item);
    }

    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack(5);

        stack.Push(34);
        stack.Push(45);
        stack.Push(2);
        stack.Push(9);
        stack.Push(17);
        stack.Push(23);

        System.out.println(Arrays.toString(stack.data));

    }
}
