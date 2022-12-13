package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.Item.CactusFlower;
import ua.edu.ucu.apps.demo.Item.FlowerBucket;
import ua.edu.ucu.apps.demo.Item.Item;
import ua.edu.ucu.apps.demo.Item.RomashkaFlower;
import ua.edu.ucu.apps.demo.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.demo.delivery.PostDeliveryStrategy;


import java.util.LinkedList;

public class DeliveryTests {
    private LinkedList<Item> items;

    @BeforeEach
    public void init() {
        items = new LinkedList<>();
        items.add(new RomashkaFlower( 50));
        items.add(new CactusFlower( 100));
        FlowerBucket newBucket = new FlowerBucket();
        newBucket.addFlowers(new RomashkaFlower(  50));
        newBucket.addFlowers(new CactusFlower(100));
        items.add(newBucket);
    }

    @Test
    public void testDHL() {
        DHLDeliveryStrategy dhlStrategy = new DHLDeliveryStrategy();
        dhlStrategy.deliver(items);
        Assertions.assertEquals(0, items.size());
    }

    @Test
    public void testPost() {
        PostDeliveryStrategy postStrategy = new PostDeliveryStrategy();
        postStrategy.deliver(items);
        Assertions.assertEquals(0, items.size());
    }
}