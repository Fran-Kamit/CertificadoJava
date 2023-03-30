/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta2_08;

import java.util.*;

/**
 *
 * @author Kamit
 */
public class ActividadResuelta2_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c, x1, x2, d;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduzca primer coeficiente (a): ");
        a = sc.nextDouble();

        System.out.print("Introduzca segundo coeficiente (b): ");
        b = sc.nextDouble();

        System.out.print("Introduzca tercer coeficiente (c): ");
        c = sc.nextDouble();

        d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("No existe solución real.");
        } else {
            if (a == 0) {
                System.out.println("No es una ecuación de segundo grado.");
            } else {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Solución 1: " + x1);
                System.out.println("Solución 2: " + x2);
            }
        }
    }
}