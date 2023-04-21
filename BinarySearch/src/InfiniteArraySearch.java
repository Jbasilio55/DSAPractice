public class InfiniteArraySearch {
    public static void main(String[] args) {
        //Suppose you have a sorted array of infinite numbers, how would you search an element in the array?

        //Source: Amazon Interview Experience.

        //Since array is sorted, the first thing clicks into mind is binary search, but the problem here is that
        // we don’t know size of array.

        //If the array is infinite, that means we don’t have proper bounds to apply binary search.
        // So in order to find position of key, first we find bounds and then apply binary search algorithm.

        //Let low be pointing to 1st element and high pointing to 2nd element of array,
        // Now compare key with high index element,

        // [1, 2, 3, 4, 5, 6, ... , n]

        int[] nums = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};

        System.out.println(bruteSearch(nums, 90));
        System.out.println(searchAns(nums, 90));

    }

    //Brute force approach
    public static int bruteSearch(int[] arr, int target){
        //set index to (0)
        int index = 0;

        //run while loop as los as the target does not equal current element
        while(target != arr[index]){
            //check if target is equal to current element
            index++;
        }
        return index;
    }

    public static int searchAns(int[] arr, int target){
        //First find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for target to be in range
        while(target > arr[end]){
            int newStart = end + 1; // new start
            //double the box value
            //end = previous end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] nums, int target, int start, int end){
        int mid;

        //run binary search
        while(start <= end){
            // find the element
            mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else{
                return mid; //ans found
            }
        }
        return -1;
    }
}
