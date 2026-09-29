public class Leetcode_162_FindPeakElement {
    public static int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        } else if (nums[0] > nums[1]) {
            return 0;
        } else if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }

        int start = 1;
        int end = nums.length - 2;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid + 1] > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num1 = { 1, 1, 3, 5, 4 };
        int[] num2 = { 1, 2, 3, 1 };
        System.out.println(findPeakElement(num1));
        System.out.println(findPeakElement(num2));
    }
}
