package com.techhub.consumer.config;

public final class Constant {

	private Constant() {
	}

	public static final String EXCHANGE_NAME = "my-exchange-3";

	public static final String QUEUE_NAME_1 = "my-queue-1";

	public static final String QUEUE_NAME_2 = "my-queue-2";

	public static final String QUEUE_NAME_3 = "my-queue-3";

	/**
	 * Here star [ * ] means zero or more words and dot [ . ] is used to
	 * differentiate the words
	 */
	public static final String MY_KEY_1 = "my.*";

	/**
	 * Here hash [ # ]means one or more words and dot [ . ] is used to differentiate
	 * the words
	 */
	public static final String MY_KEY_2 = "my.#";

	public static final String MY_KEY_3 = "my.key.*";

}
