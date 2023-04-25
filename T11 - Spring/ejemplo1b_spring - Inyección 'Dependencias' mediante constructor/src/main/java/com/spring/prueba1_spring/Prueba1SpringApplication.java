package com.spring.prueba1_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Prueba1SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prueba1SpringApplication.class, args);

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		Empleados Jaime = contexto.getBean("miEmpleadoJefe", Empleados.class);
		System.out.println("\nEL Siguiente mensaje son las responsabilidades de un Empleado construido con Spring de tipo " + Jaime.getClass());
		System.out.println("\nJaime tiene " + Jaime.getResponsabilidades());

		Empleados Sara = contexto.getBean("miEmpleadoDirector", Empleados.class);
		System.out.println("\nEL Siguiente mensaje son las responsabilidades de un Empleado construido con Spring de tipo " + Sara.getClass());
		System.out.println("\nSara tiene " + Sara.getResponsabilidades());

		Empleados Manolo = contexto.getBean("miEmpleadoRaso", Empleados.class);
		System.out.println("\nEL Siguiente mensaje son las responsabilidades de un Empleado construido con Spring de tipo " + Manolo.getClass());
		System.out.println("\nManolo tiene " + Manolo.getResponsabilidades());

		System.out.println("Jaime: " + Jaime.getDocumento());

		System.out.println("Sara: " + Sara.getDocumento());

		System.out.println("Manolo: " + Manolo.getDocumento());

		contexto.close();
		System.out.println("");
	}
}