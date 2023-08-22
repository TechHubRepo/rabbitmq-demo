package com.techhub.producer.service;

import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.amqp.support.converter.SimpleMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techhub.producer.config.Constant;

@Service
public class ProducerServiceImpl implements ProducerService {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void sendMessage(String message, String headersName, String headersValue) {
		System.out.println("Message : " + message);
		System.out.println("HeadersName : " + headersName);
		System.out.println("HeadersValue : " + headersValue);

		MessageProperties messageProperties = new MessageProperties();
		messageProperties.setHeader(headersName, headersValue);

		MessageConverter messageConverter = new SimpleMessageConverter();
		Message m = messageConverter.toMessage(message, messageProperties);

		rabbitTemplate.convertAndSend(Constant.EXCHANGE_NAME, "",m);
	}
}
