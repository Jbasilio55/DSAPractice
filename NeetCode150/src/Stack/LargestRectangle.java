//7.

package Stack;

import java.util.Stack;

public class LargestRectangle {
    //Brute force approach -> Time = O(n^2), Space O(1)
    public int largestRectangleArea(int[] heights) {
        int length = heights.length;
        int maxArea = 0;

        if (length == 0) return 0;

        for(int i = 0; i < length; i++){
            int area;
            int width = 1;

            for(int j = i + 1; j < length; j++){
                if(heights[i] <= heights[j]){
                    width ++;
                } else{
                    break;
                }
            }

            for(int k = i - 1; k >= 0; k--){
                if(heights[i] <= heights[k]){
                    width ++;
                } else{
                    break;
                }
            }

            area = width * heights[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    //Brute force approach on leetcode | Time - O(n^2), Space - O(1)
    public int largestRectangleArea2(int[] heights) {
        int n = heights.length;
        int maxArea = 0;

        for(int i = 0; i < n; ++i){
            int minHeight = Integer.MAX_VALUE;
            for(int j = i; j < n; ++j){
                minHeight = Math.min(minHeight, heights[j]);
                int width = j - i + 1;
                maxArea = Math.max(maxArea, minHeight * width);
            }
        }
        return maxArea;
    }

    //Brute force approach using arrays | Time - O(n), Space - O(n)
    public int largestRectangleArea3(int[] heights) {
        int n = heights.length;

        //check if array is empty
        if(n == 0) return 0;

        //initialize left and right variables
        int[] left = new int[n];
        left[0] = -1;

        int[] right = new int[n];
        right[n - 1] = n;

        //fill left array
        for(int i = 1; i < n; i++){
            int prev = i-1;
            while(prev >= 0 && heights[prev] > heights[i]){
                prev = left[prev];
            }
            left[i] = prev;
        }

        //fill left array
        for(int i = n-2; i >= 0; i--){
            int prev = i+1;
            while(prev < n  && heights[prev] >= heights[i]){
                prev = right[prev];
            }
            right[i] = prev;
        }

        int maxArea = 0;
        for(int i = 0; i < n; i++){
            maxArea = Math.max(maxArea, heights[i] * (right[i] - left[i] - 1));
        }

        return maxArea;
    }

    //Optimal approach using monotonic stacks | Time - O(n), Space - O(n)
    public int largestRectangleArea4(int[] heights) {
        int n = heights.length;

        //check if array is empty
        if(n == 0) return 0;

        //Initialize left and right
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for(int i = 0; i <= n; i++){
            int height = (i == n) ? 0 : heights[i];
            //If stack is empty of ht >= height[top] push in stack
            //Else process the elements and find the area

            if(stack.isEmpty() || height > heights[stack.peek()]){
                stack.push(i);
            }else {
                //Process the elements and find the maxArea for popped index
                int top = stack.pop();
                int width = (stack.isEmpty()) ? i : i - stack.peek() - 1;
                int area = heights[top] * width;
                maxArea = Math.max(maxArea, area);
                i--;
            }
        }
        return maxArea;
    }
}
