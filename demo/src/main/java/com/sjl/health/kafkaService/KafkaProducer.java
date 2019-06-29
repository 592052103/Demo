package com.sjl.health.kafkaService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	@SuppressWarnings("all")
	@Autowired
	private KafkaTemplate kafkaTemplate;

	@SuppressWarnings("unchecked")
	public void sendTest() {
		
		kafkaTemplate.send("testB","hello,kafka  "  + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
		
	}
}
