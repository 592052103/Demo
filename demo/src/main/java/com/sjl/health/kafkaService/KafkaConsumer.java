package com.sjl.health.kafkaService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	protected static Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
	
	/**
	 * 监听test主题,有消息就读取
	 * @param message
	 */
	
	@KafkaListener(topics = {"testB"})
	public void consumer(String message) {
		logger.info("test topic message : {}", message);
	}
}
