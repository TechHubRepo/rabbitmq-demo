package com.techhub.consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.techhub.consumer.config.Constant;

@Service
public class ConsumerService {

	@RabbitListener(queues = Constant.QUEUE_NAME_1)
	public void handleMessage1(String message) {
		System.out.println("HaiService - onMessageArrived for Queue1");
		System.out.println("-------------------");
		System.out.println("Message : " + message);
		System.out.println("-------------------");
	}

	@RabbitListener(queues =  Constant.QUEUE_NAME_2)
	public void handleMessage2(String message) {
		System.out.println("HaiService - onMessageArrived for Queue2");
		System.out.println("-------------------");
		System.out.println("Message : " + message);
		System.out.println("-------------------");
	}

	@RabbitListener(queues =  Constant.QUEUE_NAME_3)
	public void handleMessage3(String message) {
		System.out.println("Consumer - handleMessage3");
		System.out.println("-------------------");
		System.out.println("Message : " + message);
		System.out.println("-------------------");
	}
}
