public class RotationCountInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println(findPivot(arr));
        System.out.println(rotationCount(arr));
    }

    public static int rotationCount(int[] arr){
        int pivot = findPivot(arr);

        if(pivot == arr.length - 1){
            return 0;
        }else{
            return pivot + 1;
        }
    }

    //Use when there are no duplicates
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while(start <= end){
            mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
               return mid;
            }
            if(start < mid && arr[mid - 1] > arr[mid]){
                return mid - 1;
            }
            if(arr[start] > arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    //use when there are duplicates
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
}
