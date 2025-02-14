class Patterndemo9 
{
    public static void main(String[] args) 
    {
        int n = 4; // Rows
        int m = 5; // Columns

        for (int r = 1; r <= n; r++) 
        {
            for (int c = 1; c <= m; c++) 
            {
                if (r == 1 || r == n || c == 1 || c == m)
                {
                     System.out.print("* ");   
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
