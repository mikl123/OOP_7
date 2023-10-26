package com.example.demo;


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
class OrderTest {

	@Test
	void contextLoads() {
		Flower rose = new Flower(FlowerType.ROSE);
		DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();
		PayPalPaymentStrategy paypal = new PayPalPaymentStrategy();
		Order testOrder = new Order(rose, paypal,dhl);
	   
		testOrder.getPayStratagy().pay(rose.getPrice());
		Assertions.assertEquals(dhl, testOrder.getDeliveryStratagy());
		Assertions.assertEquals(paypal, testOrder.getPayStratagy());
		Assertions.assertEquals(rose, testOrder.getFlower());
	}

}
