public class BS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(search(arr, 2, 0, arr.length - 1));
        System.out.println(search(arr, 7, 0, arr.length - 1));
    }

    public static int search(int[] arr, int target, int start, int end){
        //base case
        if(start > end){
            return -1;
        }
        // find mid
        int mid = end - (end - start) / 2;

        //if mid == target return mis
        if(arr[mid] == target){
            return mid;
        }
        // if mid > target -> end = mid - 1
        if(arr[mid] > target){
            return search(arr, target, start,  mid - 1);
        }
        // if mid < target -> start = mid + 1
        return search(arr, target, mid + 1,  end);
    }
}
