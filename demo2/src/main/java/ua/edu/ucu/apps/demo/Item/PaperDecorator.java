package ua.edu.ucu.apps.demo.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaperDecorator extends ItemDecorator{
    Item item;
    @Override
    public double price() {
        return getPrice();
    }
    public double getPrice() {
        return 13 + item.price();
    }
    @Override
    public String getDescription() {
        item.setDescription(item.getDescription() + " + paper decorator");
        return item.getDescription();
    }
}
