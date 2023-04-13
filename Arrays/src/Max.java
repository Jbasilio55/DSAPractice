public class Max {
    public static void main(String[] args) {
        int[] arr = {12, 34, 72, 66, 90, 32};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0, 4));
    }

    private static int max(int[] arr) {
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    private static int maxRange(int[] arr, int start, int end) {
        if(end > arr.length || end > start){
            return -1;
        }

        int max = arr[start];

        for(int i = 1; i < end; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
