import java.util.Scanner;
class ArrayTotal {
    public static void main(String[] args) {
      int [] a = new int [5];
      int total=0;
      Scanner obj = new Scanner(System.in);
      System.out.print("Enter array elements : ");
      for(int i=0 ; i<5 ; i++)
      {
          a[i] = obj.nextInt();
      }
      
      System.out.println("Array Elements are : ");
      for(int i=0 ; i<5 ; i++)
      {
          System.out.println(a[i]);
      }
      
      for(int i=0 ; i<5 ; i++)
      {
          total = total + a[i];
      }
       System.out.println("Addition of Element is :"+total);
    }
}