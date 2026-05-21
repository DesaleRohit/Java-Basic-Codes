public class MultipleCatchBlock {

    public static void main(String[] args) {

        try {
            int[] arr = new int[5];
            arr[1] = 4;

            int x = 10 / 0;
            System.out.println(x);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error : " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Math error : " + e.getMessage());
        }
    }
}