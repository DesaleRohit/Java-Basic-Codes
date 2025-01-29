import java.util.Scanner;
class Cube
{
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        n = obj.nextInt();
        int c = n*n*n;
        System.out.println("Cube of "+n+" is : "+c);
       
    }
}