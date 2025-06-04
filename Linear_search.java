import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 Array Elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the Number to Search:");
        int search = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == search) {
                System.out.println("The number " + search + " is found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The number " + search + " is not found in the array.");
        }

        scanner.close();
    }
}
