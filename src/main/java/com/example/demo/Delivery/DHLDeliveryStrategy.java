package com.example.demo.Delivery;

import com.example.demo.Entities.Thing;

public class DHLDeliveryStrategy implements DeliveryInterface{
    @Override
    public String deliver(Thing thing) {
      return "Shipping item by DHL that costs " + thing.getPrice();
    }

   
    
}
