package com.jeevan.kafka.Springbootkafkaproducer.Controller;

import com.jeevan.kafka.Springbootkafkaproducer.KafkaSender.MySender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/publish-kafka/")
public class MyController {

	@Autowired
	MySender kafkaSender;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
		kafkaSender.send("hello your message is : "+message);

		return "Message sent to the Kafka topic Successfully please check the consumer kafka console in your machine";
	}

}
