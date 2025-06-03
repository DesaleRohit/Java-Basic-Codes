public class M {
    public static void main(String[] args) {
        int m = 5;
        int n = 3;

        int[] arr1 = new int[m + n]; // allocate space for m+n elements
        int[] originalArr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8};

        // Copy original elements to arr1
        for (int i = 0; i < m; i++) {
            arr1[i] = originalArr1[i];
        }

        // Append arr2 elements to arr1
        for (int i = 0; i < n; i++) {
            arr1[m + i] = arr2[i];
        }

        // Print the merged array
        for (int i = 0; i < (m + n); i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
