class Patterndemo11
{
    public static void main(String[] args) 
    {
        int n = 8;

        for (int r = 1; r <= n; r++) 
        {
            for (int c = 1; c <= r; c++) 
            {
                if (c == r || c <= 1 || r == n)
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
