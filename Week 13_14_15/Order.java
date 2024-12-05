import java.util.List;

public class Order {
    private static int counter = 1;
    private int orderId;
    private List<MenuItem> items;

    public Order(List<MenuItem> items) {
        this.orderId = counter++;
        this.items = items;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public double getTotalPrice() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
