import java.util.*;
class OddNumberRang
{
  public static void main(String[] args)
  { 
      int n1,n2;   
      Scanner obj = new Scanner(System.in);  
      System.out.println("Enter the Starting Number:");
      n1 = obj.nextInt();
  
      System.out.println("Enter the Ending Number:");
      n2 = obj.nextInt();
     
      int i = n1;
      do
      { 
         if(i % 2!= 0) 
         {
           System.out.println("\t"+i+"\n");
         }
         i++;
      }
      while( i <= n2);
  }
}