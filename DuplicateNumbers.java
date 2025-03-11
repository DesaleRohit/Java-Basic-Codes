import java.util.Scanner;

class DuplicateNumbers 
{
    public static void main(String[] args) 
    {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Duplicate Elements are: ");

        for (int i = 0; i < arr.length; i++) 
        {
           
            if (arr[i] == -1)
                continue;

            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    System.out.print(arr[i] + " ");
                    arr[j] = -1; 
                    break; 
                }
            }
        }

        scanner.close();
    }
}
