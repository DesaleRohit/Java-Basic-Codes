import java.util.Arrays;

class ArrayFill {
    public static void main(String[] args) {
         int[] arr = new int[5];

        Arrays.fill(arr, 9);
        System.out.println(Arrays.toString(arr));
    }
}