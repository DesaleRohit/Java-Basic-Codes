import java.util.Scanner;
class Square {
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        n = obj.nextInt();
        System.out.println("Square of "+n+" is : "+n*n);
    }
}