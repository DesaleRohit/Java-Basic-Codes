interface Main {
    public void pay(double amount);

    public void refund(double amount);
}

class UPI implements Main {
    @Override
    public void pay(double amount) {
        System.out.println("Paid using UPI : " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("refund using UPI: " + amount);
    }
}

class CardPayment implements Main {
    public void pay(double amount) {
        System.out.println("Paid using Card: " + amount);
    }

    public void refund(double amount) {
        System.out.println("Refund via Card: " + amount);
    }
}

public class AbstractionExample2 {
    public static void main(String[] args) {
        Main m = new UPI();
        m.pay(1000);
        m.refund(500);

        Main main = new CardPayment();
        main.pay(2000);
        main.refund(750);
    }
}
