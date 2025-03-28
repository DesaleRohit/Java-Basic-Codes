import java.util.Scanner;

public class EvenNumber_Rang 
{
    public static void main(String[] args) 
    {
        int n1, n2, i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Starting Number : ");
        n1 = scanner.nextInt();
        System.out.println("Enter the  Ending Number : ");
        n2 = scanner.nextInt();
        for (i = n1; i <= n2; i++) 
        {
            if (i % 2 == 0) 
            {
                System.out.println("\t"+i);
            }
        }

    }
}
