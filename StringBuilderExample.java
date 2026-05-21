public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rohit");
        // Modifie same object
        sb.append(" Desale");
        System.out.println(sb);

        // Insert at index 5
        sb.insert(5, " Pravin");
        System.out.println(sb);

        // Delete from index 6 to 12
        sb.delete(6, 12);
        System.out.println(sb);

        // Reverse the String
        sb.reverse();
        System.out.println(sb);

    }
}
