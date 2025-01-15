class EvenOddSum
{
  public static void main(String[] args)
  {
     int i , evensum=0 , oddsum=0;
     System.out.println("Odd \tEven");
     
     for(i=1 ; i<=20 ; i++)
     {
        if(i%2==0)
        {
           System.out.println("\t"+i);
           evensum = evensum+i;
        }
        else
        {
           System.out.print(i);
           oddsum = oddsum+i;
        }
     }
     System.out.println("-----------");
     System.out.print(oddsum);
     System.out.print("\t"+evensum);
  }
}