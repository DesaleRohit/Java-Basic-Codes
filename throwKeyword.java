public class throwKeyword {
    public static void main(String[] args) {
        int balance = 10000;
        int withdraw = 50000;

        try {
            if(balance < withdraw) {
                throw new ArithmeticException("Insufficient Balance");
            }
            balance = balance - withdraw;
            System.out.println("Remaining Balance: " + balance);
        } catch(ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
