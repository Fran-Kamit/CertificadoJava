package com.spring.prueba1_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Empleados;

@SpringBootApplication
public class Prueba1SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prueba1SpringApplication.class, args);

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//EmpleadoJefe empleado1 = new EmpleadoJefe();
		//Empleados empleado2 = new EmpleadoJefe();

		Empleados Jaime = contexto.getBean("miEmpleadoJefe", Empleados.class);
		System.out.println("\nEL Siguiente mensaje son las responsabilidades de un Empleado construido con Spring de tipo "+ Jaime.getClass());
		System.out.println("\nJaime tiene " + Jaime.getResponsabilidades());

/*		Empleados Sara = contexto.getBean("miEmpleadoDirector", Empleados.class);
		System.out.println("\nEL Siguiente mensaje son las responsabilidades de un Empleado construido con Spring de tipo "+ Sara.getClass());
		System.out.println("\nSara tiene " + Sara.getResponsabilidades());

		Empleados Manolo = contexto.getBean("miEmpleadoRaso", Empleados.class);
		System.out.println("\nEL Siguiente mensaje son las responsabilidades de un Empleado construido con Spring de tipo "+ Manolo.getClass());
		System.out.println("\nManolo tiene " + Manolo.getResponsabilidades());*/

		contexto.close();
	}
}