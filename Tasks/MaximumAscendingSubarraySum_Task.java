public class MaximumAscendingSubarraySum_Task {

    public static int maxAscendingSum(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];
            } else {
                currentSum = nums[i];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 5, 10, 50 };
        int result = maxAscendingSum(nums);

        System.out.println("Maximum Ascending Subarray Sum: " + result);
    }
}
