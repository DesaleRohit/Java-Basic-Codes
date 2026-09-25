public class MaxProductOfTwoElements_Task {
    public static int maxProduct(int[] nums) {

        int max = -1;
        int smax = -1;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                smax = max;
                max = nums[i];
            } else if (smax < nums[i]) {
                smax = nums[i];
            }
        }

        return (max - 1) * (smax - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 5, 3, 4, 2 };

        int ans = maxProduct(nums);
        System.out.println(ans);
    }
}
