package ua.edu.ucu.apps.demo.Item;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerBucket extends Item {
    List<Flower> list_of_flowers = new ArrayList<>();

    public double price() {
        double total_price = 0;
        for (Flower flower: list_of_flowers) {
            total_price += flower.price();
        }
        return total_price;
    }

    public Flower searchFlower(double price) {
        for (Flower flower: list_of_flowers) {
            if (flower.price() == price) {
                return flower;
            }
        }
        return null;
    }

    public void addFlowers(Flower flower){
        list_of_flowers.add(flower);
    }
}
