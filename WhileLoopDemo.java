import java.util.Scanner;
class WhileLoopDemo
{
   public static void main(String[] args)
   {
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the number : ");
      int n = obj.nextInt();
  
      int i=0;
      
      while(i<n)
      {
         System.out.println("IMRD College Shahada....");
         i++;
      }
         
   }
}