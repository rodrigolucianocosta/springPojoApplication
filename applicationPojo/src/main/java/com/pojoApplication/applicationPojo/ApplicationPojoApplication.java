package com.pojoApplication.applicationPojo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationPojoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ApplicationPojoApplication.class, args);
		//testanto aplicação
		ClasseA objetoA = new ClasseA();
		objetoA.executar();
		
	}

}
