public class MaxProductOfTwoElements {

    public static int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return max1 * max2;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 5, 2, 4 };

        int result = MaxProductOfTwoElements.maxProduct(nums);

        System.out.println(result);
    }
}