package com.techhub.producer.service;

import com.techhub.consumer.vo.UserRatingVo;
import com.techhub.producer.vo.OrderInfoVo;

public interface ProducerService {

	public void sendRatingMessage(UserRatingVo message);

	public void sendOrderMessage(OrderInfoVo message);
}
