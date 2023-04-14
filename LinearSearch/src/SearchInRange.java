public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {22, 45, 67, 82, 75, 33, 11, 9, 56, 100};
        System.out.println(linearSearch(nums, 75, 2, 6));
        System.out.println(linearSearchTP(nums, 75, 2, 6));
    }
    //search in the array: return the index if item found
    //otherwise if the item is not found return -1.
    public static boolean linearSearch(int[] arr, int target, int start, int end){
        //edge case
        if(arr.length == 0 || start > end || end > arr.length){
            return false;
        }

        //run a for loop
        for(int i = start; i < end; i++){
            //check all elements at every index, and see if it is the target
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    //optimized linear search to only take half the time O(N/2)
    //Using 2 pointer method (p1 - start) --->  index  <------(p2 - end)
    public static int linearSearchTP(int[] arr, int target, int start, int end){
        int length = arr.length;

        //edge case
        if(length == 0 || start > end || end > length){

        }

        // loop through half of the array length
        for(int i = start; i < end / 2; i++){
            // search in both directions from start and end towards the middle
            if(arr[i] == target){
                return i;
            }

            if(arr[end - i] == target){
                return end - i;
            }
        }
        return -1;
    }
}
