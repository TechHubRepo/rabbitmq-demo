package com.techhub.consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.techhub.consumer.config.Constant;
import com.techhub.producer.vo.Order;

@Service
public class ConsumerService {

	@RabbitListener(queues = Constant.QUEUE_NAME)
	public void handleMessage1(Order message) {
		System.out.println("---------------------- Message Received ----------------------");
		System.out.println("Message : " + message);
		System.out.println("-----------------------------------------------------------------------");
	}
}
