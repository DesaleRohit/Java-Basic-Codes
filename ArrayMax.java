import java.util.Scanner;
class ArrayMax {
    public static void main(String[] args) {
      int [] a = new int [5];
      int max=0;
      Scanner obj = new Scanner(System.in);
      System.out.print("Enter array elements : ");
      for(int i=0 ; i<5 ; i++)
      {
          a[i] = obj.nextInt();
      }
    
    for(int i=0 ; i<5 ; i++)
    {
        if(max<=a[i])
        {
            max=a[i];
        }
    }
    System.out.println("Maximum Value in Array : "+max);
    }
}