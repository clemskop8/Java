import java.util.*;

public class Cafe implements ICafe {
    private List<MenuItem> menuItems = new ArrayList<>();
    private Map<Integer, Customer> customers = new HashMap<>();
    private int customerIdCounter = 1;

    @Override
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    @Override
    public void removeMenuItem(String name) {
        menuItems.removeIf(item -> item.getName().equalsIgnoreCase(name));
    }

    @Override
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Order createOrder(Customer customer, List<MenuItem> items) {
        Order order = new Order(items);
        customer.addOrder(order);
        return order;
    }

    public Customer addCustomer(String name, String phone) {
        Customer customer = new Customer(name, phone);
        customers.put(customerIdCounter++, customer);
        return customer;
    }

    public Customer getCustomer(int id) {
        return customers.get(id);
    }
}
