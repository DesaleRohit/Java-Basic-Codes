import java.util.Scanner;
class PrimeNo
{
  public static void main(String[] args)
  {
     int n,i,flag=1;
    
     System.out.println("Enter the Number:");
     Scanner obj = new Scanner(System.in);
     n = obj.nextInt();
   
     if(n==1)
     {
        flag=1;
     }
     else
     { 
        for(i=2;i<n-1;i++)
        { 
           if(n%i==0)
           {
              flag=0;
              break;
           }
        }
     }
     if(flag==1)
     {
        System.out.println("Number is Prime");
     }
     else
     {
        System.out.println("Number is Not-Prime");
     } 
  }
}