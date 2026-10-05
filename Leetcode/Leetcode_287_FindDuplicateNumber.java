public class Leetcode_287_FindDuplicateNumber {
    public static int findDuplicate(int[] nums) {

        int start = 1;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            int count = 0;

            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };

        int duplicate = findDuplicate(nums);

        System.out.println("Duplicate number: " + duplicate);
    }
}
