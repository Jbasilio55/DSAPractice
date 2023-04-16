public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] numbs = {-100, -3, 1, 2, 3, 5, 6, 23, 45, 66, 79, 1098};
        int[] numbs2 = {99, 78, 65, 34, 22, 10, 9, 7, 5, 2};
        int[] numbs3 = {1097, 234, 111, 0, -12, -37, -87, -900, -1024, -12345};

        System.out.println(agnosticBS(numbs, 3));
        System.out.println(agnosticBS(numbs, 0));
        System.out.println(agnosticBS(numbs2, 5));
        System.out.println(agnosticBS(numbs3, 234));
    }
    public static int agnosticBS(int[] numbs, int target){
        //set start to be 0: start of the array
        int start = 0;
        // set end to be the end of the array
        int end = numbs.length - 1;
        //initialize middle
        int middle;
        //check if the array is ASC or DES
        boolean isAsc = numbs[start] < numbs[end];

            while(start <= end){
                //Find the middle element
                // middle = (start + end) / 2; this code may cause an error if (start + end) exceeds the range of java
                // better way to write to prevent this is the code below
                middle = start + (end - start) / 2;

                //If element at the middle equals the target return the index at middle
                if(numbs[middle] == target){
                    return middle;
                }

                if(isAsc){
                    //If target is greater than element at the middle. assign a new start to be middle + 1
                    if(target > numbs[middle]){
                        start = middle + 1;
                    }else{
                        //if the target is less than element at the middle. reassign end to be middle - 1
                        end = middle - 1;
                    }
                }else{
                    //If target is greater than element at the middle. assign a new start to be middle + 1
                    if(target < numbs[middle]){
                        start = middle + 1;
                    }else{
                        //If target is greater than element at the middle. assign a new start to be middle + 1
                        end = middle - 1;
                    }
                }
            }
        //return -1 if not found
        return -1;
    }
}
