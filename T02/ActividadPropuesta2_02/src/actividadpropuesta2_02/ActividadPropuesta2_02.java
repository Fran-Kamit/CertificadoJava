/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadpropuesta2_02;

import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class ActividadPropuesta2_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.print("Introduzca un número positivo o negativo: ");
        n = sc.nextInt();
        
        boolean nPositivo;
        nPositivo = n >= 0;
        
        System.out.println("¿El número introducido " + n + " es positivo? " + nPositivo);
    }
}