import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String phone;
    private List<Order> orderHistory;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.orderHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void addOrder(Order order) {
        orderHistory.add(order);
    }
}
