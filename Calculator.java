import java.util.Scanner;
class Calculator
{
  public static void main(String[] args)
  {

    Scanner obj = new Scanner(System.in);

    System.out.println("--------Calculator--------");
    System.out.println("1. Addition");
    System.out.println("2. Subtrction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");

    System.out.println("Choose an Operation Number:");
    int op = obj.nextInt();
 
    System.out.println("Enter first number: ");
    double n1 = obj.nextDouble();

    System.out.println("Enter second number: ");
    double n2 = obj.nextDouble();
  
    switch(op)
    {
       case 1:
       System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
       break;
 
       case 2:
       System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
       break;

       case 3:
       System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
       break;

       case 4:
       System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
       break;

       default:
       System.out.println("Invalid Operation Number");
         
    }
   
  }
}