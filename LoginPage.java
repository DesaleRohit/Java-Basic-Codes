import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {
        // Predefined username and password
        String correctUsername = "admin";
        String correctPassword = "1234";

        Scanner scanner = new Scanner(System.in);

        // Take username and password input from user
        System.out.print("Enter Username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter Password: ");
        String enteredPassword = scanner.nextLine();

        // Check if username and password match
        if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Username or Password!");
        }

        scanner.close();
    }
}
