import java.util.Scanner;
class StudentInfo
{
    Scanner obj = new Scanner(System.in);
    int rollno;
    String name;
    int fees;

    public void Setinfo()
    {
        System.out.print("Enter the Student Rollno : ");
        rollno = obj.nextInt();

        System.out.print("Enter the Student Name : ");
        name = obj.next();

        System.out.print("Enter the Fees : ");
        fees = obj.nextInt();
    }

    public void Showinfo()
    {
        System.out.println("Student Rollno = "+rollno);
        System.out.println("Student Name = "+name);
        System.out.println("Student fees = "+fees);
    }

    public static void main(String[] args)
    {
        StudentInfo S1 =  new StudentInfo();
        S1.Setinfo();
        S1.Showinfo();
    }
}