import java.util.Scanner;
class Driving
{
  public static void main(String[] args)
  {
    int age;
    Scanner obj = new Scanner(System.in); 

    System.out.print("Enter the Age : ");
    age = obj.nextInt();

    if(age >= 18)
    {
      System.out.println("You are Allowed for Driving");
    }
    else
    {
      System.out.println("You are Not-Allowed for Driving");
    }
}
}