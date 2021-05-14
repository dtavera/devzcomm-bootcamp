import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    public static int[] returnIndexesLinear(int[] nums, int target) {
        int[] result = new int[2];
        // This map will store the difference and the corresponding index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If we have seen the current element before
            // it means we have already encountered the other number of the pair
            if (map.containsKey(nums[i])) {
                result[0] = i;
                result[1] = map.get(nums[i]);
                return result;
            }
            // If we have not seen the current before
            // It means we have not yet encountered any number of the pair
            else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {2, 7, 1, 5};
        int target = 9;

        /* int[] nums = {3, -1, 0, 1};
        int target = 0; */

        System.out.println(Arrays.toString((returnIndexesLinear(nums, target))));
    }
}
