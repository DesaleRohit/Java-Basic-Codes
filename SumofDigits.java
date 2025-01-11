import java.util.*;
class SumofDigits
{
  public static void main(String[] args)
  {
    int num , r , sum=0;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the Number :");
    num = obj.nextInt();
  
    while (num > 0)
    {
      r = num % 10;
      sum = sum + r;
      num = num / 10; 
    }
    System.out.println("Addition is : "+sum);
    
  }
}
