import java.util.Scanner;
class ReverseArray
{
    public static void main(String[] args) 
    {
      int [] arr = new int[5];
      int n = arr.length;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the Array elements : ");
      for(int i = 0; i < n; i++)
      {
          arr[i] = scanner.nextInt();
      }

      System.out.println("Array Elements are : ");
      for(int i = 0; i < n; i++)
      {
          System.out.print(arr[i]+"  ");
      }

      for(int i = 0; i < n / 2; i++)
      {
         int temp = arr[i];
         arr[i] = arr[n - 1 - i];
         arr[n - 1 - i] = temp;
      }
      System.out.println();
      System.out.println("Reverse Array : ");
      for(int i = 0; i < n; i++)
      {
          System.out.print(arr[i]+"  ");
      }
    }
}