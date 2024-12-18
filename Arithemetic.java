class Arithemetic 
{
   public static int add(int a , int b)
   {
     int c = a + b;
     return c;
   }
   public static int sub(int a , int b)
   {
     int c = a - b;
     return c;
   }
   public static int mul(int a , int b)
   {
    int c = a * b;
    return c;
   }
   public static int div(int a , int b)
   { 
     int c = a / b;
     return c;
   }
   public static int modu(int a , int b)
   {
     int c = a % b;
     return c;
   }



    public static void main(String[] args)
  {
    int a = 10;
    int b = 5;

    System.out.println("Addition = "+add(a,b));
    System.out.println("Subtraction = "+sub(a,b));
    System.out.println("Multiplication = "+mul(a,b));
    System.out.println("Division  = "+div(a,b));
    System.out.println("Modules = "+modu(a,b));

  }
    
}