class Patterndemo8 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int m = 5;
        
        for (int r = 1; r <= n; r++) 
        {
            for (int c = 1; c <= m; c++) 
            {
                if (r == 3 || c == 3) 
                {
                    System.out.print("* ");
                } else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
