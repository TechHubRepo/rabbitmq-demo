package com.techhub.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.techhub.producer.service.ProducerService;

@RestController
public class ProducerController {

	@Autowired
	private ProducerService producerService;

	@GetMapping(value = "/m/{message}")
	public String sendMessage1(@PathVariable String message) {
		producerService.sendMessage(message);
		return message;
	}
}
