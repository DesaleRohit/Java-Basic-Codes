interface First
{
    void A1();
}
interface Second
{
    void B2();
}
class Democlass implements First,Second
{
    public void A1()
    {
        System.out.println("This is A1 Function");
    }
    public void B2()
    {
        System.out.println("This is B2 Function");
    }
}
class InterfaceDemo1
{
    public static void main(String args[])
    {
        Democlass democlass = new Democlass();
        democlass.A1();
        democlass.B2();
    }
}