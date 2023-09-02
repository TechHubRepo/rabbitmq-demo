package com.techhub.consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.techhub.consumer.config.Constant;
import com.techhub.consumer.vo.OrderInfoVo;
import com.techhub.consumer.vo.UserRatingVo;

@Service
public class ConsumerService {

	@RabbitListener(queues = Constant.RATING_QUEUE)
	public void handleMessage1(UserRatingVo message) {
		System.out.println("---------------------- RATING Message Received ----------------------");
		System.out.println("Message : " + message);
		System.out.println("---------------------------------------------------------------------------");
	}

	@RabbitListener(queues = Constant.ORDER_QUEUE)
	public void handleNamasteMessage(OrderInfoVo message) {
		System.out.println("---------------------- ORDER Message Received ----------------------");
		System.out.println("Message : " + message);
		System.out.println("----------------------------------------------------------------------------");
	}
}