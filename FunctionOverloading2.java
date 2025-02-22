import java.util.*;
class FunctionOverloading2
{ 
    public void add(int a , int b)
    {
        System.out.println("Addition of Integers : "+(a+b));
    }

    public void add(int a , int b , int c)
    {
        System.out.println("Addition of Integers : "+(a+b+c));
    }

    public void add(float a , float b)
    {
        System.out.println("Addition of Float :"+(a+b));
    }

    public static void main(String[] args) 
    {
       int a , b , c;
       float x , y;

       FunctionOverloading2 obj = new FunctionOverloading2();
       Scanner Q1 = new Scanner(System.in);
       
       System.out.println("Enter the Value of A : ");
       a = Q1.nextInt();

       System.out.println("Enter the Value of B : ");
       b = Q1.nextInt();

       System.out.println("Enter the Value of C : ");
       c = Q1.nextInt();

       System.out.println("Enter the Value of X : ");
       x = Q1.nextFloat();

       System.out.println("Enter the Value of Z : ");
       y = Q1.nextFloat();

       obj.add(a,b);
       obj.add(a,b,c);
       obj.add(x,y);
    }
}