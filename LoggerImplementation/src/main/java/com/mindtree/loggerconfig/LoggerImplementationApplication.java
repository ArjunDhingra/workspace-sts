package com.mindtree.loggerconfig;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerImplementationApplication {

	final static Logger logger = Logger.getLogger(LoggerImplementationApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggerImplementationApplication.class, args);
		LoggerImplementationApplication obj = new LoggerImplementationApplication();
//		Logger logger = Logger.getLogger
		obj.runMe("arjun");

	}

	private void runMe(String parameter) {

		if (logger.isDebugEnabled()) {
			logger.debug("This is debug : " + parameter);
		}

		if (logger.isInfoEnabled()) {
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);

	}

}
