class ArrayMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[3][3]; // 3 rows, 3 columns

        int [][] a = {
            {1,2,3},{4,5,6},
            {7,8,9}
            
            };
        
        for(int r=0 ; r<3 ; r++) //print rows
        {
            for(int c=0 ; c<3 ; c++)
            {
                 System.out.print(a[r][c]+"  "); //print columns
            }
            System.out.println("  ");
        }
       
    }
}