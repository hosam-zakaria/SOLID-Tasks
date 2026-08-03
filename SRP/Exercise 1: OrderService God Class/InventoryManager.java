package t1;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Integer> inventory = new HashMap<>();
    public InventoryManager(){
        inventory.put("LAPTOP", 10);
        inventory.put("PHONE", 25);
        inventory.put("TABLET", 15);
    }

    public boolean checkStock(String productId, int quantity){
        Integer stock = inventory.get(productId);
        return stock != null && stock >= quantity;
    }

    public void updateStock(String productId, int quantity){
        Integer stock = inventory.get(productId);
        
        if(stock == null || stock < quantity) { return; }

        inventory.put(productId, stock - quantity);
    }
}
