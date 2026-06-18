interface NotificationService {
    void sendNotification();
}

class SmsService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Notification sent via SMS");
    }
}

class EmailService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Notification sent via Email");
    }
}

class TextService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Notification sent via Text");
    }
}

// Dependent class
class OrderService {

    private NotificationService notificationService;

    // Constructor Dependency Injection
    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void placeOrder() {
        System.out.println("Order placed successfully");
        notificationService.sendNotification();
    }
}

public class LooselyCouplingExample2 {

    public static void main(String[] args) {

        // Dependency Injection
        NotificationService notification = new SmsService();
        // NotificationService notification = new EmailService();
        // NotificationService notification = new TextService();

        OrderService orderService = new OrderService(notification);

        orderService.placeOrder();
    }
}