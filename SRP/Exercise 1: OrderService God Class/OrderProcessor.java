package t1;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {
    private List<String> orders = new ArrayList<>();

    private InventoryManager inventoryManager;
    private NotificationService notificationService;

    public OrderProcessor(InventoryManager inventoryManager, NotificationService notificationService){
        this.inventoryManager = inventoryManager; 
        this.notificationService = notificationService; 
    }

    public void placeOrder(String productId, int quantity, String customerEmail){
        if(!inventoryManager.checkStock(productId, quantity)){
            System.out.println("Insufficient stock for " + productId);
            return;
        }

        double pricePerUnit = 100.0, total = pricePerUnit * quantity;
        String orderId = "ORD-" + (orders.size() + 1);
        orders.add(orderId);


        inventoryManager.updateStock(productId, quantity);

        notificationService.sendConfirmation(customerEmail, orderId, total);
    }
}
