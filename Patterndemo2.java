import java.util.Scanner;

class Patterndemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the Number of Rows: ");
        int n = scanner.nextInt();
        
      
        System.out.print("Enter the Number of Columns: ");
        int m = scanner.nextInt();
        
     
        for (int r = 1; r <= n; r++) 
        { 
            for (int c = 1; c <= m; c++) 
            { 
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
