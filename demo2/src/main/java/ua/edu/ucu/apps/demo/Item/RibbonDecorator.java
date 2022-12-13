package ua.edu.ucu.apps.demo.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RibbonDecorator extends ItemDecorator{
    Item item;
    @Override
    public double price() {
        return getPrice();
    }
    public double getPrice() {
        return 40 + item.price();
    }
    @Override
    public String getDescription() {
        item.setDescription(item.getDescription() + " + ribbon decorator");
        return item.getDescription();
    }
}
