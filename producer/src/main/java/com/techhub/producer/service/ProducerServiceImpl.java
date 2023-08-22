package com.techhub.producer.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techhub.producer.config.Constant;

@Service
public class ProducerServiceImpl implements ProducerService {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void sendMessage(String message) {
		System.out.println("Message : " + message);
		rabbitTemplate.convertAndSend(Constant.EXCHANGE_NAME, "",message);
	}
}
