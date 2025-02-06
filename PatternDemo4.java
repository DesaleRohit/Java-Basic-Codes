import java.util.Scanner;
class Patterndemo4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        
        for(int r = 1; r <= n; r++) {
            for(int c = 1; c <= n; c++) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
        
    }
}
