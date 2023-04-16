public class Main {
    public static void main(String[] args) {
        int[] numbs = {-3, -1, 1, 2, 3, 5, 6, 23, 45, 66};
        System.out.println(search(numbs, 3));
    }
    //return the index
    // return -1 if target does not exist in array
    public static int search(int[] numbs, int target){
        //set start to be 0: start of the array
        int start = 0;
        // set end to be the end of the array
        int end = numbs.length - start - 1;
        //initialize middle
        int middle;

        while(start <= end){
            //Find the middle element
            // middle = (start + end) / 2; this code may cause an error if (start + end) exceeds the range of java
            // better way to write to prevent this is the code below
            middle = start + (end - start) / 2;

            //If element at the middle equals the target return the index at middle
            if(numbs[middle] == target){
                return middle;
            }

            //If target is greater than element at the middle. assign a new start to be middle + 1
            if(target > numbs[middle]) start = middle + 1;

            //if the target is less than element at the middle. reassign end to be middle - 1
            if(target < numbs[middle]) end = middle - 1;

        }
        //return -1 if not found
        return -1;
    }
}