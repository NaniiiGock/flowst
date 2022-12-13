package ua.edu.ucu.apps.demo.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Item {
    private String description;
    public abstract double price();
    public Item(){}
}