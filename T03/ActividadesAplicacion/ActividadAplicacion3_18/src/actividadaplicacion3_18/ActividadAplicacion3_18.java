/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion3_18;

import java.util.Scanner;

/**
 *
 * @author Kamit
 */
public class ActividadAplicacion3_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Escriba el primer número: ");
        int num1 = new Scanner(System.in).nextInt();

        System.out.print("Escriba el segundo número: ");
        int num2 = new Scanner(System.in).nextInt();

        int mayor = num1 > num2 ? num1 : num2;
        int mcm = mayor;
        while (mcm % num1 != 0 || mcm % num2 != 0) {
            mcm += mayor;
        }
        System.out.println("Mínimo común múltiplo: " + mcm);
    }
}