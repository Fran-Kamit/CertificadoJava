/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta1_4;

import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class ActividadResuelta1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aActual;
        int aNacimiento;
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Año de nacimiento: ");
        aNacimiento = sc.nextInt();
        System.out.print("Año actual: ");
        aActual = sc.nextInt();
        edad = aActual - aNacimiento;
        System.out.println("Su edad es: " + edad + " años.");
    }
    
}
