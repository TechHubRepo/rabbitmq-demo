package com.techhub.producer.service;

import com.techhub.producer.vo.OrderInfoVo;

public interface ProducerService {
	
	public void sendMessage(OrderInfoVo message);
}
