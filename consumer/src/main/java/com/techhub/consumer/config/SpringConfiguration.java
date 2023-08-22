package com.techhub.consumer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
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
	@Bean(name = "myExchange1")
	public Exchange myExchange1() {
		return ExchangeBuilder.topicExchange(Constant.EXCHANGE_NAME).build();
	}

	/**
	 * Creating a queue with name myQueue1
	 * 
	 * @return
	 */
	@Bean(name = "myQueue1")
	public Queue queue1() {
		return QueueBuilder.durable(Constant.QUEUE_NAME_1).build();
	}

	/**
	 * Binding the myQueue1 with myExchange1 using routing key, the routing key name
	 * is my.key.1
	 * 
	 * @param myQueue1
	 * @param myExchange1
	 * @return
	 */
	@Bean
	public Binding myBinding1(Queue myQueue1, TopicExchange myExchange1) {
		return BindingBuilder.bind(myQueue1).to(myExchange1).with(Constant.MY_KEY_1);
		
	}

	/**
	 * Creating a queue with name myQueue2
	 * 
	 * @return
	 */
	@Bean(name = "myQueue2")
	public Queue queue2() {
		return QueueBuilder.durable(Constant.QUEUE_NAME_2).build();
	}

	/**
	 * Binding the myQueue2 with myExchange1 using routing key, the routing key name
	 * is my.key.1
	 * 
	 * @param myQueue1
	 * @param myExchange1
	 * @return
	 */
	@Bean
	public Binding myBinding2(Queue myQueue2, TopicExchange myExchange1) {
		return BindingBuilder.bind(myQueue2).to(myExchange1).with(Constant.MY_KEY_2);
	}

	/**
	 * Creating a queue with name myQueue3
	 * 
	 * @return
	 */
	@Bean(name = "myQueue3")
	public Queue queue3() {
		return QueueBuilder.durable(Constant.QUEUE_NAME_3).build();
	}

	/**
	 * Binding the myQueue3 with myExchange1 using routing key, the routing key name
	 * is my.key.1
	 * 
	 * @param myQueue1
	 * @param myExchange1
	 * @return
	 */
	@Bean
	public Binding myBinding3(Queue myQueue3, TopicExchange myExchange1) {
		return BindingBuilder.bind(myQueue3).to(myExchange1).with(Constant.MY_KEY_3);
	}
}
