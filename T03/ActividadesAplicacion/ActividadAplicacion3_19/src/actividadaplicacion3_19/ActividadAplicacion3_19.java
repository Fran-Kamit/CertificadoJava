/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion3_19;

import java.util.Scanner;

/**
 *
 * @author Kamit
 */
public class ActividadAplicacion3_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Escriba un número para calcular su raiz cuadrada: ");
        int n = new Scanner(System.in).nextInt();

        int aproximacion = 0;

        do {
            aproximacion++;
        } while (Math.pow(aproximacion, 2) <= n);

        aproximacion--;

        System.out.println("Raiz cuadrada: " + aproximacion);
        System.out.println("Resto: " + (n - Math.pow(aproximacion, 2)));

    }
}