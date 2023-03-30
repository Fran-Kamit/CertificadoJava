/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta2_09;

import java.util.Scanner;

/**
 *
 * @author Kamit
 */
public class ActividadResuelta2_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un nÃºmero entre -99.999 y 99.999: ");
        n = sc.nextInt();

        if (n > -10 && n < 10) {
            System.out.println("Tiene 1 cifra.");
        } else if (n > -100 && n < 100) {
            System.out.println("Tiene 2 cifras.");
        } else if (n > -1000 && n < 1000) {
            System.out.println("Tiene 3 cifras.");
        } else if (n > -10000 && n < 10000) {
            System.out.println("Tiene 4 cifras.");
        } else if (n > -100000 && n < 100000) {
            System.out.println("Tiene 5 cifras.");
        } else if (n <= -100000) {
            System.out.println("Error. El número es inferior a -99.999");
        } else if (n >= 100000) {
            System.out.println("Error. El número es superior a 99.999");
        }
    }
}