import java.util.Scanner;

class NthTribonacciNumber {

    public static int tribonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2 ) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 3; i <= n; i++) {
            int d = a + b + c;
            
            a = b;
            b = c; 
            c = d;
        }

        return c;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        System.out.println("Tribonacci number : "+tribonacci(n));
    }
}