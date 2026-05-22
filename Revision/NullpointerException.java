public class NullpointerException {
    public static void main(String[] args) {

        String name = null;
        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Throws NullPointerException");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally always run where exception or not....");
        }
    }
}
