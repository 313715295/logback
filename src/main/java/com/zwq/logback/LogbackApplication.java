package com.zwq.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogbackApplication {

	static Logger logger = LoggerFactory.getLogger(LogbackApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(LogbackApplication.class, args);
//		logger.info("name:{},password{}","zwq","910810");
//		logger.info("--------------------------");
//		logger.info("name:{},password{}","zwq111","910810");
//		logger.info("--------------------------");
//		logger.error("登录失败");
	}
}
