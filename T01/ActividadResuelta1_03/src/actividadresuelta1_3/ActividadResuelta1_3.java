/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta1_3;

import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class ActividadResuelta1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba su edad: ");
        edad = sc.nextInt();
        edad = edad + 1;
        System.out.print("Escriba su nombre: ");
        System.out.println("Su siguiente edad será de: " + edad + " años.");
    }
    
}
