import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest
        // (or largest) element from the unsorted portion of the list and moving it to the sorted portion of the list.
        // The algorithm repeatedly selects the smallest (or largest) element from the unsorted portion of the list and
        // swaps it with the first element of the unsorted portion. This process is repeated for the remaining unsorted
        // portion of the list until the entire list is sorted. One variation of selection sort is called “Bidirectional
        // selection sort” which goes through the list of elements by alternating between the smallest and largest element,
        // this way the algorithm can be faster in some cases.

        //The algorithm maintains two subarrays in a given array.
        //
        //The subarray which already sorted.
        //The remaining subarray was unsorted.
        //In every iteration of the selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the beginning of the sorted subarray.
        //
        //After every iteration sorted subarray size increase by one and the unsorted subarray size decrease by one.

        //After the N (size of the array) iteration, we will get a sorted array.

        int[] arr = {3, 1, 5, 4, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    public static int getMaxIndex(int[] arr, int start, int end){
        int max = start;

        for(int i = 0; i < end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second){
         int temp = arr[first];
         arr[first] = arr[second];
         arr[second] = temp;
    }
}


