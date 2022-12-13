package ua.edu.ucu.apps.demo;

import ua.edu.ucu.apps.demo.payments.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.demo.payments.PayPalPaymentStrategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaymentTest {
    private PayPalPaymentStrategy payPal;
    private CreditCardPaymentStrategy creditCard;

    @BeforeEach
    public void init() {
        creditCard = new CreditCardPaymentStrategy();
        payPal = new PayPalPaymentStrategy();
    }
    @Test
    public void testPaymentStrategies() {
        Assertions.assertTrue(creditCard.pay(700.0));
        Assertions.assertTrue(payPal.pay(900.0));
    }
}