package t1;
public class NotificationService {
    public void sendConfirmation(String customerEmail, String orderId, double total){
        System.out.println("Email to " + customerEmail + ": Order " + orderId + " confirmed. Total: $" + total);
    }
}
