class ExceptionHandling4 {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible");
        } else {
            System.out.println("eligible");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}