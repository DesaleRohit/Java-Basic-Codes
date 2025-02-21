class FunctionOverloading
{
    public void add(int a , int b)
    {
        System.out.println("Addition is : "+(a+b));
    }

    public void add(int a , int b , int c)
    {
        System.out.println("Addition is : "+(a+b+c));
    }

    public void add(double a , double b , double c)
    {
        System.out.println("Addition is : "+(a+b+c));
    }

    public static void main(String[] args)
    {
         FunctionOverloading obj = new FunctionOverloading();
         obj.add(8,5);
         obj.add(10,30,5);
         obj.add(5.5,20.5,10.2);

    }
}