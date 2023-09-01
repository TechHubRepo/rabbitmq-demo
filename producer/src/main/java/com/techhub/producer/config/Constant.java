package com.techhub.producer.config;

public final class Constant {

	private Constant() {
	}

	/** RATING exchange, queue and routing key */
	
	public static final String RATING_EXCHANGE = "my-rating-exc";

	public static final String RATING_QUEUE = "my-rating-queue";

	public static final String RATING_ROUTING_KEY = "my.rating.key";
	
	
	/** ORDER exchange, queue and routing key */

	public static final String ORDER_EXCHANGE = "my-order-exc";

	public static final String ORDER_QUEUE = "my-order-queue";

	public static final String ORDER_ROUTING_KEY = "my.order.key";
}
