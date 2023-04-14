public class FindMin {
    public static void main(String[] args) {
        int[] nums = {22, 45, 67, 82, 75, 33, 11, 9, 56, 100};
        System.out.println(min(nums));
        System.out.println(minTP(nums));
    }

    public static int min(int[] arr){
        //edge case
        if(arr.length == 0){
            return -1;
        }
        //start with 1st element and set to min
        int min = arr[0];
        //loop through array
        for(int i = 0; i < arr.length; i++){
            //if min ig greater than current element.
            if(min > arr[i]){
                //reassign min to be current element
                min = arr[i];
            }
        }
        //return min
        return  min;
    }

    //more efficient O(N/2)
    public static int minTP(int[] arr){
        //edge case
        if(arr.length == 0){
            return -1;
        }

        //start with 1st element and set to min
        int min = arr[0];

        //loop through array
        for(int i = 1; i < arr.length / 2; i++){
            //if min ig greater than current element.
            if(min > arr[i]){
                //reassign min to be current element
                min = arr[i];
            }

            //if min is greater than element towards the end of array
            if(min > arr[arr.length - i - 1]){
                //reassign min to be current element
                min = arr[arr.length - i - 1];
            }
        }

        //return min
        return  min;
    }
}
