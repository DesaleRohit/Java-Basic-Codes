public class Leetcode_33_SearchinRotatedSortedArray {

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[start] <= nums[mid]) {

                // Target lies in the sorted left half
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
            // Right half is sorted
            else {

                // Target lies in the sorted right half
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] num1 = { 4, 5, 6, 7, 0, 1, 2 };
        int[] num2 = { 4, 5, 6, 7, 0, 1, 2 };
        int[] num3 = { 1 };

        int target1 = 0;
        int target2 = 3;
        int target3 = 0;

        System.out.println(search(num1, target1)); // 4
        System.out.println(search(num2, target2)); // -1
        System.out.println(search(num3, target3)); // -1
    }
}