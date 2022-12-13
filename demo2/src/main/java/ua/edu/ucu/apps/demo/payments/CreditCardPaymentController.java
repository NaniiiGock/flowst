package ua.edu.ucu.apps.demo.payments;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/v1/creditcard-payment")
@RestController
public class CreditCardPaymentController  {
    @GetMapping
    public List<? extends Payment> getPayments() {
        return List.of(new CreditCardPaymentStrategy());
    }
}