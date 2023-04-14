public class Main {
    public static void main(String[] args) {
        int[] nums = {22, 45, 67, 82, 75, 33, 11, 9, 56, 100};
        System.out.println(linearSearch(nums, 67));
        System.out.println(linearSearchIndex(nums, 9));
        System.out.println(linearSearchTP(nums, 9));
        System.out.println(LinearSearchFE(nums, 75));
        System.out.println(LinearSearchFE(nums, 101));
    }

    //loops through array and return the index if found
    private static int linearSearchIndex(int[] arr, int target) {
        //edge case
        if(arr.length == 0){
            return -1;
        }
        //for loop to check if target matches an element in the array
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    //search in the array: return the index if item found
    //otherwise if the item is not found return -1.
    public static boolean linearSearch(int[] arr, int target){
        //edge case
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

    //optimized linear search to only take half the time O(N/2)
    //Using 2 pointer method (p1 - start) --->  index  <------(p2 - end)
    public static int linearSearchTP(int[] arr, int target){
        int length = arr.length;

        //edge case
        if(length == 0) return -1;

        // loop through half of the array length
        for(int i = 0; i < length / 2; i++){
            // search in both directions from start and end towards the middle
            if(arr[i] == target){
                return i;
            }

            if(arr[length - i - 1] == target){
                return length - i - 1;
            }
        }
        return -1;
    }

    public static int LinearSearchFE(int[] arr, int target){
        //edge case if array is empty
        if(arr.length == 0){
            return -1;
        }

        //for each loop(if found return the element)
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        //if the above code is not executed return -1. stating that the target is not in the array
        return -1;
    }
}