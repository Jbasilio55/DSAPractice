//https://leetcode.com/problems/search-in-rotated-sorted-array/

public class RotatedSortedArray {
    public static void main(String[] args) {
        //There is an integer array nums sorted in ascending order (with distinct values).
        //
        //Prior to being passed to your function, nums is possibly rotated at an unknown
        // pivot index k (1 <= k < nums.length) such that the resulting array is
        // [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
        // For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
        //
        //Given the array nums after the possible rotation and an integer target, return the index of
        // target if it is in nums, or -1 if it is not in nums.
        //
        //You must write an algorithm with O(log n) runtime complexity.
        //
        //
        //Example 1:
        //
        //Input: nums = [4,5,6,7,0,1,2], target = 0
        //Output: 4

        //Example 2:
        //
        //Input: nums = [4,5,6,7,0,1,2], target = 3
        //Output: -1

        //Example 3:
        //
        //Input: nums = [1], target = 0
        //Output: -1

        int[] nums = {4,5,6,7,0,1,2};
        int[] nums2 = {1};
        int[] nums3 = {5,6,7,0,1,2,3,4};

//        System.out.println(findPivot(nums));
//        System.out.println(findPivot(nums));
//        System.out.println(findPivot(nums2));
//        System.out.println(findPivot(nums3));

        System.out.println(searchRotatedArray(nums, 0));
        System.out.println(searchRotatedArray(nums, 3));
        System.out.println(searchRotatedArray(nums2, 2));

    }

    public static int searchRotatedArray(int[] arr, int target){
        int pivot = findPivot(arr);

        //if you did not find a pivot, it means the array is not rotated
        if(pivot == -1){
            //run normal BS
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        //if pivot is found, you have found 2 asc sorted arrays
        // 3 cases
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while(start <= end){
            mid = start + (end - start) / 2;

            //4 cases
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return - 1;
    }

    public static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while(start <= end){
            mid = start + (end - start) / 2;

            //4 cases
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            // if element at the start, middle, end are all equals
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                //skip the duplicates

                //NOTE: What if one of the 3 elements (start, mid, end) were pivot
                // check if start is pivot
                if(arr[start]  > arr[start + 1]){
                    return start;
                }
                start++;

                if(arr[end]  < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in the right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return - 1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        int mid;

        while(start <= end){
            //Find the middle element
            // middle = (start + end) / 2; this code may cause an error if (start + end) exceeds the range of java
            // better way to write to prevent this is the code below
            mid = start + (end - start) / 2;

            //If element at the middle equals the target return the index at middle
            if(arr[mid] == target){
                return mid;
            } else if (target < arr[mid]) {
                //if the target is less than element at the middle. reassign end to be middle - 1
                end = mid - 1;
            }else{
                //If target is greater than element at the middle. assign a new start to be middle + 1
                start = mid + 1;
            }
        }
        //return -1 if not found
        return -1;
    }
}
