import java.util.Scanner;

public class DeleteAlternateChar {

    public static String deleteAlternate(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
   

        String s = "Java Programming";

        String result = deleteAlternate(s);

        System.out.println(result);

       
    }
}