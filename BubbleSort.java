import java.util.Scanner;

class BubbleSort 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Size: ");
        int size = scanner.nextInt();
        int[] a = new int[size];

        System.out.println("Enter the Elements: ");
        for (int i = 0; i < size; i++) 
        {
            a[i] = scanner.nextInt();
        }

        System.out.print("Before Sorting: ");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(a[i] + "  ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) 
        {
            for (int k = 0; k < size; k++) 
            {
                if (a[i] < a[k]) {
                    int temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
                }
            }
        }

        System.out.print("After Sorting: ");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(a[i] + "  ");
        }
    }
}
