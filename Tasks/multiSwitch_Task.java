import java.util.Scanner;

public class multiSwitch_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Menu ----");
        System.out.println("1. Factorial");
        System.out.println("2. Prime Check");
        System.out.println("3. Reverse a Number");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int ch = scanner.nextInt();

        int num = 0;
        if (ch >= 1 && ch <= 3) {
            System.out.print("Enter the number: ");
            num = scanner.nextInt();
        }

        switch (ch) {
            case 1:
                int fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact = fact * i;
                }
                System.out.println("Factorial of " + num + " is: " + fact);
                break;

            case 2:
                boolean isPrime = true;
                if (num <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i <= num / 2; i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime) {
                    System.out.println(num + " is a Prime Number.");
                } else {
                    System.out.println(num + " is NOT a Prime Number.");
                }
                break;

            case 3:
                int reverse = 0;
                int temp = num;
                while (temp != 0) {
                    int digit = temp % 10;
                    reverse = reverse * 10 + digit;
                    temp = temp / 10;
                }
                System.out.println("Reversed number: " + reverse);
                break;

            case 4:
                System.out.println("Exiting the program.");
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
