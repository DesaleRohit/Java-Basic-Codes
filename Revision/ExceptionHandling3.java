class ExceptionHandling3 {
    public static void main(String[] args) {
        try {
            int x = 10 / 2;
            System.out.println(x);
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}