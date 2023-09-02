package com.techhub.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techhub.producer.service.ProducerService;
import com.techhub.producer.vo.OrderInfoVo;
import com.techhub.producer.vo.UserRatingVo;

@RestController
@RequestMapping(value = "/send/message")
public class ProducerController {

	@Autowired
	private ProducerService producerService;

	@PostMapping(value = "/rating")
	public String sendOrderMessage(@RequestBody UserRatingVo message) {
		producerService.sendRatingMessage(message);
		return "RATING MESSAGE SENT";
	}

	@PostMapping(value = "/order")
	public String sendRating(@RequestBody OrderInfoVo message) {
		producerService.sendOrderMessage(message);
		return "ORDER MESSAGE SENT";
	}
}
