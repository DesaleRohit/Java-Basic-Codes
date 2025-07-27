public class nullPointerException {
    public static void main(String[] args) {
        String s = null;
        try {
             System.out.println(s.length());
        } catch(NullPointerException e) {
            System.out.println(e);
            System.out.println("String value is "+e.getMessage());
        }
       
    }
}