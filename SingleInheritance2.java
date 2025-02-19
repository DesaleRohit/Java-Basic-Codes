class Info
{
    public int id;
    public String name;

    public void setdata(int id , String name)
    {
      this.id = id;
      this.name = name;
    }
}
class Internal extends Info
{
    public int internal_cpp;
    public int internal_java;

    public void setInternal(int icpp , int ijava)
    {
        this.internal_cpp = icpp;
        this.internal_java = ijava;
    }
}

class SingleInheritance2
{
    public static void main(String[] args)
    {
         Internal obj = new Internal();
         obj.setdata(1,"Rohit");
         obj.setInternal(80 , 90);
         System.out.println("Student ID : "+obj.id);
         System.out.println("Student Name : "+obj.name);
         System.out.println("Internal C++ Marks : "+obj.internal_cpp);
         System.out.println("Internal Java Marks : "+obj.internal_java);
         
         obj.setdata(2,"Dhanesh");
         obj.setInternal(70 , 90);
         System.out.println("Student ID : "+obj.id);
         System.out.println("Student Name : "+obj.name);
         System.out.println("Internal C++ Marks : "+obj.internal_cpp);
         System.out.println("Internal Java Marks : "+obj.internal_java);



    }
}