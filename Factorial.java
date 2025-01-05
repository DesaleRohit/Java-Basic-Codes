import java.util.Scanner;
class Factorial
{
  public static void main(String[] args)
  {
    int n , i , f=1;

    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the number:");
    n = obj.nextInt();
    
    for(i=1 ; i<=n ; i++)
    {
      f = f * i;
    }
    System.out.println("Factorial is ="+f);
  
  }
}