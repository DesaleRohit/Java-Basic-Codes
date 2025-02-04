import java.util.Scanner;

class MatrixAddition 
{
    public static void main(String[] args) 
   {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] z = new int[3][3];
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter the first Matrix Elements:");
        for (int r = 0; r < 3; r++) 
        {
            for (int c = 0; c < 3; c++) 
            {
                a[r][c] = scanner.nextInt();
            }
        }

        
        System.out.println("Enter the second Matrix Elements:");
        for (int r = 0; r < 3; r++) 
        {
            for (int c = 0; c < 3; c++) 
            {
                b[r][c] = scanner.nextInt();
            }
        }

     
        System.out.println("First Matrix:");
        for (int r = 0; r < 3; r++) 
        {
            for (int c = 0; c < 3; c++) 
            {
                System.out.print("\t" + a[r][c]);
            }
            System.out.println();
        }

      
        System.out.println("Second Matrix:");
        for (int r = 0; r < 3; r++) 
        {
            for (int c = 0; c < 3; c++) 
            {
                System.out.print("\t" + b[r][c]);
            }
            System.out.println();
        }

        for (int r = 0; r < 3; r++) 
        {
            for (int c = 0; c < 3; c++) 
            {
                z[r][c] = a[r][c] + b[r][c];
            }
        }

      
        System.out.println("The Addition of 3x3 Matrix is:");
        for (int r = 0; r < 3; r++)
        {
            for (int c = 0; c < 3; c++) 
            {
                System.out.print("\t" + z[r][c]);
            }
            System.out.println();
        }
        
       
    }
}
