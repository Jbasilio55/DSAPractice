public class CeilingOfANumber {
    public static void main(String[] args) {
        // Given an array find the ceiling of the target number
        // int[] numbs = {1, 2, 3, 4, 5, 6}, target = 4 | output 5

        int[] numbs = {1, 4, 7, 9, 13, 23, 27, 29, 33, 45};
        System.out.println(ceiling(numbs, 13));
        System.out.println(ceiling(numbs, 27));
    }

    public static int ceiling(int[] arr, int target){
        //make a start, middle, and end of the sorted array
        int start = 0;
        int end = arr.length - 1;
        int middle;

        //Run while loop BS
        while(start <= end){
            middle = start + (end - start) / 2;
            //If target equals middle return it else return an element +1 greater
            if(target == arr[middle]){
                //If middle is at the end return it, instead of return arr.length + 1
                if(middle == arr.length - 1){
                    return arr[middle];
                }
                return arr[middle + 1];
            }
            //if target is greater than mid, then change start to be mid + 1
            if(target > arr[middle]){
                start = middle + 1;
            }
            //if target is less than mid, then change end to be mid + 1
            if(target < arr[middle]){
                end = middle - 1;
            }
        }
        //if element is not found return -1
        return -1;
    }
}
