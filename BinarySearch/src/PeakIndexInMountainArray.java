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

    }

    public static int peakIndexInMountainArray(int[] arr){

    }
}
