public class CountVowels {
    public static void main(String[] args) {
        String str = "IMRD College";
        int count = 0;

        str = str.toLowerCase(); //Converting string to lowercase to handle both uppercase/lowercase vowels

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number os vowels : "+count);
    }
}