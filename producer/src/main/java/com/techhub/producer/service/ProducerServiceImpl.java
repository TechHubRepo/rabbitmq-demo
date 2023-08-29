package com.techhub.producer.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techhub.producer.config.Constant;
import com.techhub.producer.vo.OrderInfoVo;

@Service
public class ProducerServiceImpl implements ProducerService {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void sendMessage(OrderInfoVo message) {
		System.out.println("************ Sending Message ************");
		System.out.println("MESSAGE : "+message);
		rabbitTemplate.convertAndSend(Constant.EXCHANGE_NAME, Constant.ROUTING_KEY, message);
	}
}
