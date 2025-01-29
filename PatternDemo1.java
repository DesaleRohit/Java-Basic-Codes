import java.util.Scanner;
class PatternDemo1
{
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        n = obj.nextInt();
        for(int i=1 ; i<=n ; i++)
        {
             System.out.println("*****");
        }
       
    }
}