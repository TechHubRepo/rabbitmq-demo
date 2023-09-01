package com.techhub.producer.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techhub.consumer.vo.UserRatingVo;
import com.techhub.producer.config.Constant;
import com.techhub.producer.vo.OrderInfoVo;

@Service
public class ProducerServiceImpl implements ProducerService {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void sendOrderMessage(OrderInfoVo message) {
		System.out.println("************ Sending ORDER Message ************");
		System.out.println("MESSAGE : "+message);
		rabbitTemplate.convertAndSend(Constant.ORDER_EXCHANGE, Constant.ORDER_ROUTING_KEY, message);
	}

	@Override
	public void sendRatingMessage(UserRatingVo message) {
		System.out.println("************ Sending RATING Message ************");
		System.out.println("MESSAGE : "+message);
		rabbitTemplate.convertAndSend(Constant.RATING_EXCHANGE, Constant.RATING_ROUTING_KEY, message);
	}
}
