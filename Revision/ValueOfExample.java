public class ValueOfExample {
    public static void main(String[] args) {

        String number = "25";

        // Convert String to Integer object
        Integer result = Integer.valueOf(number);

        System.out.println("Result: " + result);
        System.out.println("After adding 5: " + (result + 5));
    }
}
