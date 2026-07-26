public class MoveZeroToEnd {
    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 3, 12 };

        int index = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zero
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        // Print array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}