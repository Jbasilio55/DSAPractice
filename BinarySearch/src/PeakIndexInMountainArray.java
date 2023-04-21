//https://leetcode.com/problems/find-peak-element/

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        //An array arr a mountain if the following properties hold:
        //
        //arr.length >= 3
        //There exists some i with 0 < i < arr.length - 1 such that:
            //arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
            //arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
        //Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
        //
        //You must solve it in O(log(arr.length)) time complexity.
        //
        //
        //Example 1:
        //
        //Input: arr = [0,1,0]
        //Output: 1
        //Example 2:
        //
        //Input: arr = [0,2,1,0]
        //Output: 1
        //Example 3:
        //
        //Input: arr = [0,10,5,2]
        //Output: 1
    }

    //Brute force approach is just a linear search checking each element and
    // if the current element higher than (variable - highestValue) element return it
    public static int search(int[] arr){
        //set highest Value to minimum value
        int highestValue = Integer.MIN_VALUE;
        //for loop
        for(int i = 0; i < arr.length; i++){
            //if current value equals highestValue
            if(arr[i] > highestValue){
                //reassign the highest value to current value
                highestValue = arr[i];
            }
        }
        //return highest value;
        return highestValue;
    }

    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while(start < end){
            //find mid of an array
            mid = start + (end + start) / 2;
            //if mid is greater than the next (+ 1) element set end equal to mid
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else {
                //if mid is less than mid-element, set start to mid + 1
                start = mid + 1;
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // return start or mid because they are both equal
    }
}
