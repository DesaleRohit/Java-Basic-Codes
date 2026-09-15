import java.util.Arrays;

public class Leetcode_167_TwoSum_Task {
    public static int[] twoSum(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                return new int[] { start + 1, end + 1 };
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 8, 10, 11, 15 };
        int target = 19;

        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
}
