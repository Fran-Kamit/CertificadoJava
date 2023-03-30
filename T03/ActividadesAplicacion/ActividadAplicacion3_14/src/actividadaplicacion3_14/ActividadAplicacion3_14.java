/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion3_14;

import java.util.Scanner;

/**
 *
 * @author Kamit
 */
public class ActividadAplicacion3_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introducir un número y sacar cuántos nºs primos hay.");

        /*
        Scanner sc = new Scanner(System.in);

        int n, primos = 1;

        System.out.print("Introduzca un número mayor a 1: ");
        n = sc.nextInt();

        if (n > 1) {

            for (int i = 2; i <= n; i++) {
                boolean esPrimo = true;
                int j = 2;
                while (j < i && esPrimo) {
                    if (n % j == 0) {
                        esPrimo = false;
                    }
                    primos++;
                    j++;
                }
                

            }
            System.out.println("Hay " + primos + " números primos entre " + n + " y 1.");

        } else {
            System.out.println("Error. Introduzca un número válido.");
        }
        */
        
        System.out.print("Introduzca un número mayor a 1: ");
        int hasta = new Scanner(System.in).nextInt();
        int contadorPrimos=1;
        /*System.out.println("1 -> primo");*/
        
        if (hasta > 1) {
            
            for (int num = 2; num <= hasta; num++) {
            boolean esPrimo = true;
            int i = 2;
            while (i < num && esPrimo) {
                if (num % i == 0) {
                    esPrimo = false;
                }
                i++;
            }
            /*System.out.print(num + " -> ");*/
            if (esPrimo) {
               /* System.out.println("primo");*/
                contadorPrimos++;
            } else {
               /* System.out.println("no primo");*/
            }
        }
        System.out.println("Hay " + contadorPrimos + " números primos entre " + hasta + " y 1.");
            
        } else {
            System.out.println("Error. Introduzca un número válido.");
        }
    }
}