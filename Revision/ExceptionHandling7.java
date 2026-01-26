class ExceptionHandling7 {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");

            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero");
            }

            int [] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index error");
        }
           System.out.println("Program continues...");
    }
}