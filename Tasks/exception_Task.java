import java.util.Scanner;

public class exception_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        try {
            System.out.println("Enter 6 numbers (will cause an error):");
            
            // BUGGY LOOP - goes out of bounds
            for (int i = 0; i <= 5; i++) {
                arr[i] = scanner.nextInt(); // will fail at i = 5
            }

           
            System.out.print("Array elements: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError: Tried to access invalid index of array!");
        } catch (Exception e) {
            System.out.println("\nSome error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
