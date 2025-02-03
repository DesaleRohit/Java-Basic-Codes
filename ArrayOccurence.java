import java.util.Scanner;
class ArrayOccurence {
    public static void main(String[] args) {
        int [] a = new int[5];
        int temp=0 , oc , i;
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the elements : ");
        for(i=0 ; i<5 ; i++)
        {
            a[i] = obj.nextInt();
        }
        
        System.out.print("Enter the Number to check occurence : ");
        oc = obj.nextInt();
       
       for(i=0 ; i<5 ; i++)
  	  {
	   if(oc==a[i])
	   {
	   	 temp = temp + 1;
	   }
	  }
	System.out.println(oc+" is repeat "+temp+" times");
    }
}