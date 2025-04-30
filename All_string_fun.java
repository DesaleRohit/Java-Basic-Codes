public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "  Java Programming  ";

        // Length of a string
        System.out.println("Length of str1: " + str1.length());

        // Concatenation
        String result = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + result);

        // Character at index
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // Substring
        System.out.println("Substring of str3 (2 to 6): " + str3.substring(2, 6));

        // Convert to upper and lower case
        System.out.println("str1 in uppercase: " + str1.toUpperCase());
        System.out.println("str2 in lowercase: " + str2.toLowerCase());

        // Trim leading and trailing spaces
        System.out.println("Trimmed str3: '" + str3.trim() + "'");

        // Replace characters
        System.out.println("str3 after replacing 'a' with 'x': " + str3.replace('a', 'x'));

        // Compare strings
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase 'HELLO': " + str1.equalsIgnoreCase("HELLO"));

        // Starts with / ends with
        System.out.println("str1 starts with 'He': " + str1.startsWith("He"));
        System.out.println("str2 ends with 'ld': " + str2.endsWith("ld"));

        // Check if empty
        String emptyStr = "";
        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());

        // String to char array
        char[] chars = str1.toCharArray();
        System.out.print("Characters in str1: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
    }
}
