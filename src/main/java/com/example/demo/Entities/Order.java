package com.example.demo.Entities;

import com.example.demo.Delivery.DeliveryInterface;
import com.example.demo.Payment.PaymentInterface;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter
public class Order {
    private Flower flower;
    private PaymentInterface payStratagy;
    private DeliveryInterface deliveryStratagy;
    public String toString() {
        return flower.toString()+"\n" + payStratagy.pay(flower.getPrice()) + "\n" + deliveryStratagy.deliver(flower);
    }
}
