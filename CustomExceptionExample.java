import java.util.*;
class CustomException extends Exception
{
    public CustomException(String message)
    {
        super(message);
    }
}
class CustomExceptionExample
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int age;
        try 
        {   
            System.out.print("Enter Your Age : ");
            age = scanner.nextInt();
            if(age < 18)
            {
                throw new CustomException("Age must be 18 or above. Please enter a valid age.");
            }
            else
            {
                System.out.println("You are allowed to drive.");
            }
        }
        catch(CustomException ex)
        {
            System.out.println("Exception : "+ex.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println("Invalid input. Please enter a valid numeric age.");
        }
    }
}