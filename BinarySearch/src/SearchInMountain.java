//https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountain {
    public static void main(String[] args) {
        //(This problem is an interactive problem.)
        //
        //You may recall that an array arr is a mountain array if and only if:
        //
        //arr.length >= 3
        //There exists some i with 0 < i < arr.length - 1 such that:
        //arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
        //arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
        //Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.
        //
        //You cannot access the mountain array directly. You may only access the array using a MountainArray interface:
        //
        //MountainArray.get(k) returns the element of the array at index k (0-indexed).
        //MountainArray.length() returns the length of the array.
        //Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.
        //
        //
        //
        //Example 1:
        //
        //Input: array = [1,2,3,4,5,3,1], target = 3
        //Output: 2
        //Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
        //Example 2:
        //
        //Input: array = [0,1,2,4,2,1], target = 3
        //Output: -1
        //Explanation: 3 does not exist in the array, so we return -1.
    }

    public static int search(){

    }

    public int findInMountainArray(int[] arr, int target, int start, int end){
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
