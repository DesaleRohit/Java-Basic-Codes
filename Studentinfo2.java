class Studentinfo2
{
    public int id;
    public String name;
    public int fees;

   public Studentinfo2(int id , String name , int fees)
    {
        this.id = id;
        this.name = name;
        this.fees = fees;
    }
    public void Showinfo()
    {
        System.out.println("Student Rollno = "+id);
        System.out.println("Student Name = "+name);
        System.out.println("Student fees = "+fees);
    }
  public static void main(String[] args)
  {
      Studentinfo2 studentinfo2 = new Studentinfo2(1 , "Rohit" , 10000);
      studentinfo2.Showinfo();
  }    
}
