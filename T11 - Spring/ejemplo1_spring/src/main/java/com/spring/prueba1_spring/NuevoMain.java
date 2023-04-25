/*Apartado 7 - SINGLETON Y PROTOTYPE*/

package com.spring.prueba1_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NuevoMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("copiaDeApplicationContext.xml");

        Empleados Ana = contexto.getBean("EmpleadoDirector", Empleados.class);
        System.out.println("\nDirección de memoria de Ana: ");
        System.out.println(Ana);

        Empleados Manolo = contexto.getBean("EmpleadoDirector", Empleados.class);
        System.out.println("\nDirección de memoria de Manolo: ");
        System.out.println(Manolo + "\n");

        if (Ana == Manolo) {
            System.out.println("Es el mismo objeto");
        } else {
            System.out.println(" Son distintos");
        }
        System.out.println("");

        contexto.close();
        System.out.println("");
    }
}