package ua.edu.ucu.apps.demo.Item;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class Flower extends Item {
    @Setter
    private double price;
    @Override
    public double price() {
        return price;
    }
}
