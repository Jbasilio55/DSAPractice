import java.util.Arrays;

public class PassingArrayInMethods {
    public static void main(String[] args) {
        // Arrays are mutable in Java
        // value can be changed in the method because it is referencing the same array.

        int[] nums = {12, 36, 78, 53, 90};
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void change(int[] arr){
        arr[0] = 34;
        arr[3] = 56;
        arr[4] = 0;
    }
}
