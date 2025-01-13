import java.util.*;
class ArrayDemo
{
  public static void main(String[] args)
  { 
     int[] array = new int [5];
     int i;
     
     Scanner obj = new Scanner(System.in);
     System.out.println("Enter the Array elements:");
   
     for(i=0 ; i<5 ; i++)
     {
        array[i]=obj.nextInt();
     }
     for(i=0 ; i<5 ; i++)
     {
       // System.out.println(i+" ArrayIndex ="+array[i]);
	System.out.println("Array Index is :"+i+"     Array element is :"+array[i]);
     }
  }
}