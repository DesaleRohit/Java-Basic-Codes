class LogicalExample {
    public static void main(String[] args) {
        
        int age = 19;
        boolean hasID = true;

        //logiacal && check both conditions 
        if (age >= 18 && hasID) {            
            System.out.println("Allowed to enter");
        } else {
            System.out.println("Not allowed");
        }
    }
}