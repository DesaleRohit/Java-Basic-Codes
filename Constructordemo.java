class Constructordemo
{
    String brand;
    Constructordemo(String b)
    {
        brand = b;
        System.out.println("Brand = "+brand);
    }
    public static void main(String args[])
    {
        Constructordemo obj = new Constructordemo("BMW");
    }
}