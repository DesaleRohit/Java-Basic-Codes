class A
{
    public String company = "Suzuki";
}
class B extends  A
{
    public String model1 = "Swift";
    public String model2 = "Baleno";
    public String model3 = "Ciaz";
}

class SingleInheritance
{
    public static void main(String[] args)
    {
        B obj = new B();
        System.out.println("Brand of Car = "+obj.company);
        System.out.println("Model 1 = "+obj.model1);
        System.out.println("Model 2 = "+obj.model2);
        System.out.println("Model 3 = "+obj.model3);
    }
}