public class ParseIntExample {
    public static void main(String[] args) {

        String number = "25";

        // Convert String to primitive int
        int result = Integer.parseInt(number);

        System.out.println("Result: " + result);
        System.out.println("After adding 5: " + (result + 5));
    }
}
