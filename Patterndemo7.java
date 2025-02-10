class Patterndemo7 
{
    public static void main(String[] args) 
    {
        int n = 5; 
        int a = 1; 

        for (int r = 1; r <= n; r++) 
        { 
            for (int c = 1; c <= r; c++) 
            { 
                System.out.print(a++ + " ");  
            }
            System.out.println(); 
        }
    }
}
