package com.techhub.producer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

	/** RATING exchange, queue and routing key configuration */

	@Bean(name = "myRatingExchange")
	public DirectExchange myRatingExchange() {
		return ExchangeBuilder.directExchange(Constant.RATING_EXCHANGE).build();
	}

	@Bean(name = "myRatingQueue")
	public Queue myRatingQueue() {
		return QueueBuilder.durable(Constant.RATING_QUEUE).build();
	}

	@Bean
	public Binding myNamasteBinding(
			@Qualifier("myRatingQueue") Queue queue,
			@Qualifier("myRatingExchange") DirectExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(Constant.RATING_ROUTING_KEY);
	}

	/** ORDER exchange, queue and routing key configuration */

	@Bean(name = "myOrderExchange")
	public DirectExchange myOrderExchange() {
		return ExchangeBuilder.directExchange(Constant.ORDER_EXCHANGE).build();
	}

	@Bean(name = "myOrderQueue")
	public Queue myOrderQueue() {
		return QueueBuilder.durable(Constant.ORDER_QUEUE).build();
	}

	@Bean
	public Binding myHelloBinding(
			@Qualifier("myOrderQueue") Queue queue,
			@Qualifier("myOrderExchange") DirectExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(Constant.ORDER_ROUTING_KEY);
	}
}
