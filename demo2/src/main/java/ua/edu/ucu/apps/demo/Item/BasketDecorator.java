package ua.edu.ucu.apps.demo.Item;
public class BasketDecorator extends ItemDecorator{
    Item item;
    @Override
    public double price() {
        return this.price();
    }

    double getPrice() {
        return 4+this.item.price();
    }

    @Override
    public String getDescription() {
        item.setDescription(item.getDescription() + " + basket decorator");
        return item.getDescription();
    }
}
