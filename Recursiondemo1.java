class Recursiondemo1
{
   public static void recursion(int num)
    {
      
        if( num <= 5)
        {
            System.out.println(num+" ");
            recursion(num+1);
        }
    }
    
    public static void main(String[] args) 
    {
       int num = 1;
       recursion(num);
       
    }
}