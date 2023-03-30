/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion3_20;

import java.util.Scanner;

/**
 *
 * @author Kamit
 */
public class ActividadAplicacion3_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sumar distintas cantidades. Para no introducir más datos poner \"0\".");

        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 0;

        while (a != 0) {
            System.out.print("Introducir cantidad a sumar: ");
            a = sc.nextInt();
            b += a;
        }
        System.out.println("Total cantidad sumada = " + b);
    }
}