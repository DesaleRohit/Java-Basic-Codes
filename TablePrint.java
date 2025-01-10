import java.util.*;
class TablePrint
{
  public static void main(String[] args)
  {
     int n,i;
     Scanner obj = new Scanner(System.in);
     System.out.println("Enter the Number:");
     n = obj.nextInt();
   
     for( i=1 ; i<=10 ; i++)
     {
       System.out.println("\n"+n+" x "+i+" = "+n*i);
     }
   }
}