package com.git.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		System.out.println("GIT Application");
		int a= 10;
		System.out.println("Modifivation done :: "+a);
	}

}
