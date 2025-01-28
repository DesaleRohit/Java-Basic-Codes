class SwapingDemo
{
   public static void main(String[] args)
   {
      int a = 10 ;
      int b = 20;
      int temp;

     System.out.println("Before Swaping value of A is : "+a+" and value of B is : "+b);

     temp = a;
     a = b;
     b = temp;

    System.out.println("After Swaping value of A is : "+a+" and value of B is : "+b);
   
 
   }
}