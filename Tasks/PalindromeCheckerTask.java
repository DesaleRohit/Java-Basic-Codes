import java.util.Scanner;

public class PalindromeCheckerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string or number: ");
        String input = sc.nextLine();

        // Remove spaces and make lowercase for string comparison
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        // Check if input is a number
        if (cleanInput.matches("\\d+")) {
            // Convert to number and check palindrome
            int num = Integer.parseInt(cleanInput);
            if (isNumberPalindrome(num)) {
                System.out.println(input + " is a Palindrome Number");
            } else {
                System.out.println(input + " is NOT a Palindrome Number");
            }
        } else {
            // Check string palindrome
            if (isStringPalindrome(cleanInput)) {
                System.out.println(input + " is a Palindrome String");
            } else {
                System.out.println(input + " is NOT a Palindrome String");
            }
        }
    }

    // Function to check number palindrome
    public static boolean isNumberPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        return original == reversed;
    }

    // Function to check string palindrome
    public static boolean isStringPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
