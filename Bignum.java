import java.util.*;
class Bignum
{
  public static void main(String[] args)
  {
    int a,b,c;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the First Number:");
    a = obj.nextInt();
 
    System.out.println("Enter the Second Number:");
    b = obj.nextInt(); 
   
    System.out.println("Enter the Third Number:");
    c = obj.nextInt();
   
    if(a > b)
    {
       if(a > c)
       {
         System.out.println(a+" is Big Number");
       }
       else
       {
         System.out.println(c+" is Big Number");
       }
    }
    else
    {
      if(b > c)
      {
         System.out.println(b+" is Big Number");

      }
      else
      {
         System.out.println(c+" is Big Number");
      }
    }

  }
}