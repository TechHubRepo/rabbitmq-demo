package com.techhub.consumer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;

@Configuration
public class SpringConfiguration {

	/**
	 * Creating the exchange with name my-exchange-1
	 * 
	 * @return
	 */
	@Bean(name = "myExchange")
	public Exchange myExchange() {
		return ExchangeBuilder.directExchange(Constant.EXCHANGE_NAME).build();
	}

	/**
	 * Creating a queue with name myQueue1
	 * 
	 * @return
	 */
	@Bean(name = "myQueue")
	public Queue myQueue() {
		return QueueBuilder.durable(Constant.QUEUE_NAME).build();
	}

	/**
	 * Binding the myQueue with myExchange using routing key, the routing key name
	 * my.hello.key
	 * 
	 * @param myQueue1
	 * @param myExchange1
	 * @return
	 */
	@Bean
	public Binding myBinding1(Queue myQueue, DirectExchange myExchange) {
		return BindingBuilder.bind(myQueue).to(myExchange).with(Constant.ROUTING_KEY);
	}
}
