package com.techhub.producer.service;

import com.techhub.producer.vo.Order;

public interface ProducerService {
	
	public void sendMessage(Order message);
}
