package com.example.demo.Controllers;

import java.util.concurrent.Flow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Delivery.DHLDeliveryStrategy;
import com.example.demo.Delivery.DeliveryInterface;
import com.example.demo.Delivery.PostDeliveryStrategy;
import com.example.demo.Entities.Flower;
import com.example.demo.Entities.FlowerType;
import com.example.demo.Entities.Order;
import com.example.demo.Entities.Thing;
import com.example.demo.Payment.CreditCardPaymentStrategy;
import com.example.demo.Payment.PayPalPaymentStrategy;
import com.example.demo.Payment.PaymentInterface;
@RequestMapping("/")
@RestController
public class OrderController {
    @GetMapping("/")
	public String create_order(@RequestParam String flower, @RequestParam String payment, @RequestParam String shipping) {
		Flower flower_obj = new Flower(FlowerType.ROSE);;
		PaymentInterface payment_obg = new PayPalPaymentStrategy();;
		DeliveryInterface delivery_obj = new DHLDeliveryStrategy();;
		if(flower =="rose"){
	
		}else if (flower =="chamomile"){
			flower_obj = new Flower(FlowerType.CHAMOMILE);
		}else if (flower == "tulip"){
			flower_obj = new Flower(FlowerType.TULIP);
		}
		if(shipping == "dhl"){
		
		}else if(shipping == "post" ){
			delivery_obj = new PostDeliveryStrategy();
		}
		if(payment == "paypal"){
	
		}else if(shipping == "post" ){
			payment_obg = new CreditCardPaymentStrategy();
		}
		try{
			Order order = new Order(flower_obj,payment_obg,delivery_obj);
			return order.toString();
		}catch(Exception ex){
			return "Something wrong (You probably choesed wrong options)";
		}
		
	}
}
