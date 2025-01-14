import java.util.Scanner;
class Do_WhileLoop
{
   public static void main(String[] args)
   {
       int n , i=0;
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter any number :");
       n = obj.nextInt();

       do
       {
          System.out.println("IMRD Shahada");
          i++;
       }while(i < n);
   }
}