public class LargestNumberAtLeastTwice {

    public static int deminantIndex(int[] nums) {

        int largest = -1;
        int secondLargest = -1;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
                index = i;
            } else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }
        if (largest >= 2 * secondLargest) {
            return index;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 6, 1, 0 };

        int result = deminantIndex(nums);

        System.out.println("Index = " + result);
    }
}
