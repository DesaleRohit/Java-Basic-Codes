import java.util.Scanner;
class ArrayMin {
    public static void main(String[] args) {
      int [] a = new int [5];
      int min=0;
      Scanner obj = new Scanner(System.in);
      System.out.print("Enter array elements : ");
      for(int i=0 ; i<5 ; i++)
      {
          a[i] = obj.nextInt();
      }
    min = a[0];
    for(int i=0 ; i<5 ; i++)
    {
        if(min>a[i])
        {
            min=a[i];
        }
    }
    System.out.println("Minimum Value in Array : "+min);
    }
}