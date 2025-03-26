public class Oddnumber_sum 
{
    public static void main(String[] args) 
    {
        int sum = 0;
        int i;
        for (i = 1; i <= 10; i++) 
        {
            if (i % 2 != 0) 
            {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("Sum of Odd Number : "+sum);
    }
}
