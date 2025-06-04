import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of random numbers to generate: ");
        int count = scanner.nextInt();

        System.out.print("Enter the minimum value: ");
        int min = scanner.nextInt();

        System.out.print("Enter the maximum value: ");
        int max = scanner.nextInt();

        if (min > max) {
            System.out.println("Minimum value should be less than or equal to maximum value.");
            return;
        }

        System.out.println("\nGenerated Random Numbers:");
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            System.out.println(randomNumber);
        }

        scanner.close();
    }
}
