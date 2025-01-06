import java.util.Scanner;
class Fabonacci
{
  public static void main(String[] args)
  {
     int level;
     int a=0;
     int b=1;
     int c =0;
    
     Scanner obj = new Scanner(System.in);
     System.out.println("Enter the Number:");
     level = obj.nextInt();

     for(int i=1 ; i<=level ; i++)
     {
         c = a + b;
         System.out.println(c);
         a = b;
         b = c;
     }  
  }
}