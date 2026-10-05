public class Leetcode_167_TwoSum {

    public static int[] twoSum(int nums[], int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            if (nums[start] + nums[end] == target) {
                return new int[] { start + 1, end + 1 };
            } else if (nums[start] + nums[end] < target) {
                start++;
            } else {
                end--;
            }

        }
        return new int[0];
    }

    public static void main(String[] args) {

        int nums[] = { 2, 7, 11, 15 };
        int target = 9;

        int ans[] = twoSum(nums, target);
        System.out.println("Index 1: " + ans[0] + " Index 2: " + ans[1]);

    }
}
