package com.example.demo.Payment;

public class CreditCardPaymentStrategy implements PaymentInterface {

    @Override
    public String pay(Double price) {
        return "Price: "+price+" payed using Credit Card";
    }
   
}
