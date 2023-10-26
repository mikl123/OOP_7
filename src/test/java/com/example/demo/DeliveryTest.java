package com.example.demo;


import java.util.concurrent.Flow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import com.example.demo.Delivery.DHLDeliveryStrategy;
import com.example.demo.Entities.Flower;
import com.example.demo.Entities.FlowerType;
import com.example.demo.Entities.Order;
import com.example.demo.Entities.Thing;
import com.example.demo.Payment.PayPalPaymentStrategy;

@SpringBootTest
class DeliveryTest {

	@Test
	void contextLoads() {
		Flower rose = new Flower(FlowerType.ROSE);
		DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();
		PayPalPaymentStrategy paypal = new PayPalPaymentStrategy();
		Order testOrder = new Order(rose, paypal,dhl);
	   
		testOrder.getPayStratagy().pay(rose.getPrice());
		Assertions.assertEquals("Shipping item by DHL that costs 50.0", testOrder.getDeliveryStratagy().deliver(rose));
		
	}

}
