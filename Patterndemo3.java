import java.util.*;
class Patterndemo3 
{
    public static void main(String[] args) 
    {
      int n;
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the Number : ");
      n = obj.nextInt();
      
      	for(int i=1 ; i<=n ; i++)
	{
		for( int j=1 ; j<=n ; j++)
		{
			System.out.print(j+" ");
		}
			System.out.println();
	}
    }
}