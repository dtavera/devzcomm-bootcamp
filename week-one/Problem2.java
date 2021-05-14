import java.util.Arrays;

public class Problem2 {

    public static int[] returnIndexes(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i == j) {
                    continue;
                }

                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int[] nums = {2, 7, 1, 5};
        int target = 9;

        /* int[] nums = {3, -1, 0, 1};
        int target = 0; */

        System.out.println(Arrays.toString((returnIndexes(nums, target))));
    }
}
