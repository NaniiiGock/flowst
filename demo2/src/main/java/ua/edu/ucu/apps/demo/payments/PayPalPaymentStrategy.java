package ua.edu.ucu.apps.demo.payments;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayPalPaymentStrategy implements  Payment{
    private String description;

    public PayPalPaymentStrategy() {
        description = "PayPal payment";
    }

    @Override
    public boolean pay(double price) {
        System.out.println("Paid with paypal");
        return true;
    }
}
