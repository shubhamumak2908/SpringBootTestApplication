package com.git.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner {

	private static Logger log = LoggerFactory.getLogger(MessageRunner.class);
	public void run(String... args) throws Exception {
		try {
			log.info("STARTED");
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("GIT Application");
		int a= 10;
		System.out.println("Modifivation done :: "+a);
		log.info("STARTED");
	}

}
