import java.util.Scanner;
class LeapYear
{
  public static void main(String[] args)
  {
    int n;
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the Year : ");
    n = obj.nextInt();
 
    if(n % 2 == 0)
    {
       System.out.println("The Year is Leap....");
    }
    else
    {
       System.out.println("The Year is Not-Leap....");
    }
    
  }
}