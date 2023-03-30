/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion2_19;

import java.util.Scanner;

/**
 *
 * @author Kamit
 */
public class ActividadAplicacion2_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grados, grados1, result;

        System.out.println("Conversor de grados a radianes.");
        
        System.out.print("Introduce los grados: ");
        grados = sc.nextInt();

        if (grados > -360 && grados < 360) {
            result = (grados * Math.PI) / 180;
            System.out.println(grados + "º es igual a " + result + " radianes.");
        } else {
            grados1 = grados % 360;
            result = (grados1 * Math.PI) / 180;
            System.out.println(grados + "º es igual a " + grados1 + "º, que a su vez es igual a " + result + " radianes.");
        }
    }
}