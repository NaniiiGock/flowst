package ua.edu.ucu.apps.demo.delivery;
import ua.edu.ucu.apps.demo.Item.Item;
import java.util.LinkedList;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DHLDeliveryStrategy implements Delivery {
    private String name;
    private String description;

    public DHLDeliveryStrategy() {
        name = "DHL_delivery";
        description = "DHL_delivery_strategy";
    }

    @Override
    public void deliver(LinkedList<Item> items) {
        LinkedList<Item> del_items;
        del_items = items;
        items.removeAll(del_items);
        System.out.println("Delivery by DHL done");
    }
}
