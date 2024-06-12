package Practice.Stacks;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_CAPACITY = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_CAPACITY);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean Push(int item) {
        if(isfull()){
            System.out.println("Stack is full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int Pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Can not pop from an empty stack!!");
        }

//        int removed = data[ptr];
//        ptr--;
//        return removed;

        return data[ptr--];
    }

    public boolean isfull() {
        return ptr == data.length - 1;
    }

    public int Peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Can not peek from an empty stack!!");
        }

        return data[ptr];
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean pop() {
        data[ptr] = 0;
        ptr--;
        return true;
    }

    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);

        stack.Push(34);
        stack.Push(45);
        stack.Push(2);
        stack.Push(9);
        stack.Push(17);

        System.out.println(stack.Pop());
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());
    }
}
