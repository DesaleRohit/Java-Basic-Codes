import java.util.Scanner;

class CustomException extends Exception 
{
    public CustomException(String message) 
    {
        super(message);
    }
}

public class CustomExceptionExample2
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int age;

        while (true) 
        {
            try 
            {
                System.out.print("Enter the Age: ");
                age = scanner.nextInt();

                if (age < 18) 
                {
                    throw new CustomException("Age must be 18 or above. Please enter a valid age.");
                } 
                else 
                {
                    System.out.println("You are allowed to drive.");
                    break; // Exit loop when valid age is entered
                }
            } 
            catch (CustomException ex) 
            {
                System.out.println("Exception: " + ex.getMessage());
            } 
            catch (Exception ex) 
            {
                System.out.println("Invalid input. Please enter a valid numeric age.");
                scanner.next(); // Clear invalid input
            }
        }

        scanner.close();
    }
}
