
import java.util.Scanner;
class SearchElement {
    public static void main(String[] args) {
        int [] a = new int[5];
        int search , check = 0 , i;
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the elements : ");
        for(i=0 ; i<5 ; i++)
        {
            a[i] = obj.nextInt();
        }
        System.out.println("Elements are : ");
        for(i=0 ; i<5 ; i++)
        {
            System.out.println(a[i]);
        }
        
        System.out.print("Please enter the Search element : ");
        search = obj.nextInt();
        
        for(i=0 ; i<5 ; i++)
        {
            if(a[i]==search)
            {
                check = 1;
                break;
            }
        }
        if(check==1)
        {
            System.out.println("We have found the search element number "+search+" at position "+(i + 1));
        }
        else
        {
           System.out.println("Sorry!! we have not found the search number "+search);
        }
    }
}