class StringBufferMethods {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Programming");

        sb.insert(0, "Java ");      // Java Programming
        sb.replace(5, 16, "Language");  // Java Language
        sb.delete(0, 5);          //  Language
        sb.reverse();             //  egaugnaL

        System.out.println(sb);
    }
}
