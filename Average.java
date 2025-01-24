import java.util.Scanner;
class Average
{
   public void Avg(int n1 , int n2 , int n3)
   {
      float Total = (n1 + n2 + n3) / 3;
  
      System.out.println("Average of 3 no ="+Total);

   }
   public static void main(String[] args)
   {
      int n1;
      int n2;
      int n3;

     Scanner obj = new Scanner(System.in);
     System.out.println("Enter 3 Numbers : ");
     n1 = obj.nextInt(); 
     n2 = obj.nextInt();
     n3 = obj.nextInt();

    Average A = new Average();
    A.Avg(n1,n2,n3);
   }
}