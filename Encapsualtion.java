class Encapsualtion
{
    private int id;
    private String name;

    public void show(int id , String name)
    {
        this.id = id;
        this.name = name;
        System.out.println("ID = "+id);
        System.out.println("Name = "+name);
    }
    public static void main(String[] args)
    {
        Encapsualtion encapsualtion = new Encapsualtion();
        encapsualtion.show(1,"Swapnil");
    } 
}