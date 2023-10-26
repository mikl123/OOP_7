package com.example.demo.Payment;

public class PayPalPaymentStrategy implements PaymentInterface {
    public String pay(Double price) {
        return "Price: "+price+" payed using Paypal";
    }

}
