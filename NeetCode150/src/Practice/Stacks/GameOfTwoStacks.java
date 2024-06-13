package Practice.Stacks;

import java.util.List;

public class GameOfTwoStacks {

    //by checking one stack at a time and then adding from second stack
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        // Write your code here
        int result = 0, st1_count = 0, st2_count = 0, total_sum = 0;

        for(Integer st1_element : a) {
            if(total_sum + st1_element > maxSum) {
                break;
            }
            total_sum += st1_element;
            st1_count++;
        }

        result = st1_count;

        for(Integer st2_element : b) {
            total_sum += st2_element;
            st2_count++;
            while(total_sum > maxSum && st1_count > 0) {
                total_sum -= a.get(st1_count - 1);
                st1_count--;
            }
            result = (total_sum <= maxSum) ? Math.max(st1_count+st2_count, result) : result;
        }
        return result;
    }
}
