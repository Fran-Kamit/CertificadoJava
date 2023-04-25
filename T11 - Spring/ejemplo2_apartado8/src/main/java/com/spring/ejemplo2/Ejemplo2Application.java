package com.spring.ejemplo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Ejemplo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo2Application.class, args);

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Construimos un bean del contenedor
        Empleados Maria = contexto.getBean("Director", Empleados.class);

        System.out.println(Maria.getDocumento());
        System.out.println(Maria.getResponsabilidades());

		contexto.close();
		System.out.println("");
	}
}