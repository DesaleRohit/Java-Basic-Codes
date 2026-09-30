import java.util.HashSet;

public class Leetcode_217_ContainsDuplicate {
    public static boolean duplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums = { 20, 50, 40, 20, 10 };

        boolean result = duplicate(nums);

        System.out.println(result);

    }
}
