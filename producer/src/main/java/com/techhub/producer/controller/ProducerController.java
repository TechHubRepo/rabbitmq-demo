package com.techhub.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techhub.producer.service.ProducerService;
import com.techhub.producer.vo.OrderInfoVo;

@RestController
public class ProducerController {

	@Autowired
	private ProducerService producerService;

	@PostMapping(value = "/message")
	public String sendMessage1(@RequestBody OrderInfoVo orderInfoVo) {
		producerService.sendMessage(orderInfoVo);
		System.out.println("==== MESSAGE SENT ====");
		return "MESSAGE SENT";
	}
}
