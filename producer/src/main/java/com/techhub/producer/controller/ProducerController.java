package com.techhub.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.techhub.producer.config.Constant;
import com.techhub.producer.service.ProducerService;

@RestController
public class ProducerController {

	@Autowired
	private ProducerService producerService;

	@GetMapping(value = "/m1/{message}")
	public String sendMessage1(@PathVariable String message) {
		producerService.sendMessage(message, Constant.MY_KEY_1);
		return Constant.MY_KEY_1;
	}

	@GetMapping(value = "/m2/{message}")
	public String sendMessage2(@PathVariable String message) {
		producerService.sendMessage(message, Constant.MY_KEY_2);
		return Constant.MY_KEY_2;
	}

	@GetMapping(value = "/m3/{message}")
	public String sendMessage3(@PathVariable String message) {
		producerService.sendMessage(message, Constant.MY_KEY_3);
		return Constant.MY_KEY_3;
	}
}
