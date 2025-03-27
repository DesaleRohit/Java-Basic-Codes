public class EvenNumber_sum {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for(i=1 ; i<=10 ; i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("Sum of Even Numbers : "+sum);

    }
}
