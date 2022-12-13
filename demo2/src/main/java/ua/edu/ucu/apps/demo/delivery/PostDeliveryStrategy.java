package ua.edu.ucu.apps.demo.delivery;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.Item.Item;
import java.util.LinkedList;

@Getter
@Setter
public class PostDeliveryStrategy implements Delivery {
    private String name;
    private String description;

    public PostDeliveryStrategy() {
        name = "Post_delivery";
        description = "Post_delivery_strategy";
    }

    @Override
    public void deliver(LinkedList<Item> items) {
        LinkedList<Item> items_del;
        items_del = items;
        items.removeAll(items_del);
        System.out.println("Delivery by post done");
    }
}
