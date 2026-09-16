import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_Leetcode {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int sum = target - nums[i];

            if (map.containsKey(sum)) {
                return new int[] { map.get(sum), i };
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 1, 5, 8, 3, 2 };
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}
