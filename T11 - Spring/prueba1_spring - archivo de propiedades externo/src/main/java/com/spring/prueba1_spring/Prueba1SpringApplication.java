/*Ejercicio 7.B en el programa setter*/

package com.spring.prueba1_spring;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Prueba1SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prueba1SpringApplication.class, args);

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// EmpleadoJefe empleado1 = new EmpleadoJefe();
		// Empleados empleado2 = new EmpleadoJefe();

		Empleados Jaime = contexto.getBean("miEmpleadoJefe", Empleados.class);
		System.out.println(
				"\nEL Siguiente mensaje son las responsabilidades de un Empleado construido con Spring de tipo "
						+ Jaime.getClass());
		/**** 7.A ****/
		System.out.println("\nJaime tiene " + Jaime.getResponsabilidades());

		Empleados Sara = contexto.getBean("miEmpleadoDirector", Empleados.class);
		System.out.println(
				"\nEL Siguiente mensaje son las responsabilidades de un Empleado construido con Spring de tipo "
						+ Sara.getClass());
		/**** 7.A ****/
		System.out.println("\nSara tiene " + Sara.getResponsabilidades());

		Empleados Manolo = contexto.getBean("miEmpleadoRaso", Empleados.class);
		System.out.println(
				"\nEL Siguiente mensaje son las responsabilidades de un Empleado construido con Spring de tipo "
						+ Manolo.getClass());
		/**** 7.A ****/
		System.out.println("\nManolo tiene " + Manolo.getResponsabilidades());

		/**** 7.A-B ****/
		System.out.println("Jaime: " + Jaime.getDocumento());
		System.out.println("Sara: " + Sara.getDocumento());
		System.out.println("Manolo: " + Manolo.getDocumento());

		/*** 7.C ***/
		System.out.println("\nemail de Jaime: " + Jaime.getEmailDepartamental());
		System.out.println("Empresa: " + Jaime.getEmpresa());

		System.out.println("\nemail de Sara: " + Sara.getEmailDepartamental());
		System.out.println("Empresa: " + Sara.getEmpresa());

		System.out.println("\nemail de Manolo: " + Manolo.getEmailDepartamental());
		System.out.println("Empresa: " + Manolo.getEmpresa());

		/*** Mostrar contenido de act 7.D **********************************/
		String texto = "";
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("D:\\·Curso JAVA con framework spring\\2- Spring MVC e hibernate\\T11 - Spring\\prueba1_spring - archivo de propiedades externo\\src\\main\\resources\\datosImportantes.propiedades"));
			String linea = in.readLine();
			while (linea != null) {
				texto = texto + linea + '\n';
				linea = in.readLine();
			}

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					System.out.println(ex);
				}
			}
		}
		System.out.println("\nContenido del archivo \'datosImportantes\': " + texto);
		/********************************************/

		contexto.close();
	}
}