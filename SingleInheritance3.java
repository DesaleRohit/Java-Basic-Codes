import java.util.Scanner;

class Student 
{
    public int a;
    public int b;

    public void set(int a, int b) 
    {
        this.a = a;
        this.b = b;
    }
}

class Info extends Student 
{
    public int c;
    public int d;

    public void setdata(int c, int d) 
    {
        this.c = c;
        this.d = d;
    }
}

class SingleInheritance3 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Info obj = new Info();

        System.out.println("Enter value of A: ");
        int a = in.nextInt(); 

        System.out.println("Enter value of B: ");
        int b = in.nextInt();

        obj.set(a, b);

        System.out.println("Enter value of C: ");
        int c = in.nextInt();  

        System.out.println("Enter value of D: ");
        int d = in.nextInt();  

        obj.setdata(c, d);  

        
        System.out.println("Value of A: " + obj.a);
        System.out.println("Value of B: " + obj.b);
        System.out.println("Value of C: " + obj.c);
        System.out.println("Value of D: " + obj.d);

    }
}
