import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if
        // they are in the wrong order. This algorithm is not suitable for large data sets as its average and worst-case
        // time complexity is quite high.

        //Input: arr[] = {6, 3, 0, 5}
        //
        //First Pass:
        //
        //Bubble sort starts with very first two elements, comparing them to check which one is greater.
        //( 6 3 0 5 ) –> ( 3 6 0 5 ), Here, algorithm compares the first two elements, and swaps since 6 > 3.
        //( 3 6 0 5 ) –>  ( 3 0 6 5 ), Swap since 6 > 0
        //( 3 0 6 5 ) –>  ( 3 0 5 6 ), Swap since 6 > 5
        //
        //Second Pass:
        //
        //Now, during second iteration it should look like this:
        //( 3 0 5 6 ) –>  ( 0 3 5 6 ), Swap since 3 > 0
        //( 0 3 5 6 ) –>  ( 0 3 5 6 ), No change as 5 > 3
        //
        //Third Pass:
        //
        //Now, the array is already sorted, but our algorithm does not know if it is completed.
        //The algorithm needs one whole pass without any swap to know it is sorted.
        //( 0 3 5 6 ) –>  ( 0 3 5 6 ), No change as 3 > 0
        //Array is now sorted and no more pass will happen.

        int[] arr = {6, 3, 0, 5};
        int[] arr2 = {6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println(Arrays.toString(bubbleSort(arr2)));

        System.out.println(Arrays.toString(bubbleSort2(arr)));
        System.out.println(Arrays.toString(bubbleSort2(arr2)));
    }

    // Time Complexity = Best case: O(n) <- if array is already sorted | Worst case: O(n^2) <- compares and swaps all elements.
    //Space complexity = O(1) - constant
    public static int[] bubbleSort(int[] arr){
        int temp;
        boolean swapped;

        //run the loop n-1 times
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                //swap if the current element is smaller than the previous element
                if(arr[j] < arr[j - 1]){
                    //swap
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j -1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        return arr;
    }

    public static int[] bubbleSort2(int[] arr){
        boolean swapped = true;

        while(swapped){
            int temp;
            swapped = false;

            for(int i = 0; i < arr.length - i; i++){
                if(arr[i] > arr[i + 1]){
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        }
        return arr;
    }
}
