import java.util.Scanner;

public class LinearSearch2 {

    public static void linearSearch(int[] a, int item) {
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (item == a[i]) {
                System.out.println("Element found at Index : " + i);
                System.out.println("Item is : " + item);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element is Not-Found");
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 50, 65, 20};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Element to search: ");
        int item = scanner.nextInt();

        linearSearch(a, item);

        scanner.close();
    }
}
