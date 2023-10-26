package com.example.demo.Delivery;

import com.example.demo.Entities.Thing;

public class PostDeliveryStrategy implements DeliveryInterface{

    @Override
    public String deliver(Thing thing) {
        return "Post delivery strategy that costs " + thing.getPrice();
    }
    
}
