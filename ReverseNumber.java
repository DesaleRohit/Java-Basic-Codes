import java.util.*;
class ReverseNumber
{
    public static void main(String args[])
    {
        int num;
        int rev = 0;
        int rem = 0;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the Number :");
        num = Scanner.nextInt();
        while(num>0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reverse Number is : "+rev);
    }
}