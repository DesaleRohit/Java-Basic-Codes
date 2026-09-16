import java.util.Arrays;

public class Leetcode_Two_Sum_Sorted {
    public static int[] twoSum(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int sum = nums[start] + nums[end];

            if (sum == target) {
                return new int[] { start + 1, end + 1 };
            }

            else if (sum < target) {
                start++;
            }

            else {
                end--;
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        int[] nums = { 1, 5, 8, 12, 25 };
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}
