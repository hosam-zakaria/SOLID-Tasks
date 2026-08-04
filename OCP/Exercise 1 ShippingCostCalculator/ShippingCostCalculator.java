public class ShippingCostCalculator {
    private ShippingStrategy strategy;
    public ShippingCostCalculator(ShippingStrategy strategy){
        this.strategy = strategy;
    }

    public double calculate(double weight){
        return strategy.calculateCost(weight);
    }
}
