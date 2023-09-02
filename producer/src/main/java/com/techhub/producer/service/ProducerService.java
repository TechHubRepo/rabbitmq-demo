package com.techhub.producer.service;

import com.techhub.producer.vo.OrderInfoVo;
import com.techhub.producer.vo.UserRatingVo;

public interface ProducerService {

	public void sendRatingMessage(UserRatingVo message);

	public void sendOrderMessage(OrderInfoVo message);
}
