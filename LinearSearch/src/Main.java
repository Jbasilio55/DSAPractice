public class Main {
    public static void main(String[] args) {
        int[] nums = {22, 45, 67, 82, 75, 33, 11, 9, 56, 100};
        System.out.println(linearSearch(nums, 67));
    }

    //search in the array: return the index if item found
    //otherwise if the item is not found return -1.
    public static boolean linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }

        //run a for loop
        for(int i = 0; i < arr.length; i++){
            //check all elements at every index, and see if it is the target
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}