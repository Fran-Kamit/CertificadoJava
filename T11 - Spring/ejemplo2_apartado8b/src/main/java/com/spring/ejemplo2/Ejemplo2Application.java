package com.spring.ejemplo2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.ejemplo2.ArchivoConfiguracion;

@SpringBootApplication
public class Ejemplo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo2Application.class, args);
		
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(ArchivoConfiguracion.class);


    	Empleados Maria = contexto.getBean("empleadoDirector", Empleados.class);

        System.out.println(Maria.getDocumento());
        System.out.println(Maria.getResponsabilidades());

		contexto.close();
	}
}