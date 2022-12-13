package ua.edu.ucu.apps.demo.payments;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CreditCardPaymentStrategy implements Payment{
    private String description;

    public CreditCardPaymentStrategy() {
        description = "Credit card payment";
    }

    @Override
    public boolean pay(double price) {
        System.out.println("Paid with Credit card");
        return true;
    }
}
