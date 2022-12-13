package ua.edu.ucu.apps.demo.order;
import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.Item.Item;
import ua.edu.ucu.apps.demo.payments.Payment;
import java.util.LinkedList;


public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;



    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
        System.out.println("Payment with " + payment.getClass().getSimpleName() +" is done");
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
        System.out.println("Payment with " + delivery.getClass().getSimpleName() + " is done");
    }
    public double calculateTotalPrice() {
        double total_price = 0;
        for (Item item: items) {
            total_price += item.price();
        }
        return total_price;
    }

    public void processOrder() {
        if (payment.pay(calculateTotalPrice())) {
            delivery.deliver(items);
            System.out.println("delivery and payment are done");
        }
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Item removeItem(Item item) {
        items.remove(item);
        return item;
    }
}
