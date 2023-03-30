/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion3_13;

import java.util.Scanner;

/**
 *
 * @author Kamit
 */
public class ActividadAplicacion3_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Programa para incrementar, en segundos, la hora de un reloj.");

        Scanner sc = new Scanner(System.in);

        int h, m, s, increS;

        System.out.print("Introduce las horas: ");
        h = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        m = sc.nextInt();
        System.out.print("Introduce los segundos: ");
        s = sc.nextInt();

        System.out.print("Introduce los segundos a incrementar: ");
        increS = sc.nextInt();

        if (h <= 23 && h >= 0 && m <= 59 && m >= 0 && s <= 59 && s >= 0) {
            for (int i = 1; i <= increS; i++) {
                s++;
                if (s == 60) {
                    s = 0;
                    m++;
                    if (m == 60) {
                        m = 0;
                        h++;
                        if (h == 24) {
                            h = 0;
                        }
                    }
                }
            }
            System.out.println("La hora con el incremento es = " + h + ":" + m + ":" + s);
        } else {
            System.out.println("Error. Introduzca una hora válida.");
        }
    }
}