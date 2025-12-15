import java.util.Scanner;
import java.util.Arrays;

class SecondSmallNum_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);   // ascending order

        System.out.println("Second smallest element: " + arr[1]);
    }
}
