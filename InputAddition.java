import java.util.Scanner;
class InputAddition
{
   public static void main(String[] args)
   { 
      int a  , b , c = 0;

      Scanner obj = new Scanner(System.in);

      System.out.println("Enter the first number:");
      a = obj.nextInt();

      System.out.println("Enter the Second number:");
      b = obj.nextInt();
      
      c = a + b;
    
      System.out.println("Addition = "+c);
      
   }
}