public class TargetNumberAddition 
{
    public static void main(String[] args) 
    {
        int[] a = {1, 5, 8, 3, 2};
        int target = 9;
        boolean found = false;

        for (int i = 0; i < a.length; i++) 
        {
            for (int k = i + 1; k < a.length; k++) // Start from i + 1 to avoid duplicate checks
            { 
                if (a[i] + a[k] == target) 
                {
                    System.out.println("Addition of index " + i + " and index " + k + " is : " + target);
                    found = true;
                }
            }
        }

        if (!found) 
        {
            System.out.println("No valid pair found");
        }
    }
}
