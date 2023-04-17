public class CeilingOfANumber {
    public static void main(String[] args) {
        // Given an array find the ceiling of the target number
        // int[] numbs = {1, 2, 3, 4, 5, 6, 8, 20}, target = 7 | output 8, target = 4 | output 4

        int[] numbs = {1, 4, 7, 9, 13, 23, 27, 29, 33, 45};

        System.out.println(ceiling(numbs, 13));
        System.out.println(ceiling(numbs, 27));
        System.out.println(ceiling(numbs, 45));
    }

    public static int ceiling(int[] arr, int target){
        //make a start, middle, and end of the sorted array
        int start = 0;
        int end = arr.length - 1;
        int middle;

        //edge case. if target is greater than the greatest element
        if(target > arr[end]){
            return -1;
        }

        //Run while loop BS
        while(start <= end){
            //Find middle element
            middle = start + (end - start) / 2;

            //if target is greater than mid
            if(target < arr[middle]){
                end = middle - 1;
            } else if (target > arr[middle]) {
                //if target is less than mid
                start = middle + 1;
            }else{
                //else return mid
                return arr[middle];
            }
        }
        //if element is not found return -1
        return arr[start];
    }
}
