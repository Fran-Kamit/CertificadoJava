/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion3_15;

import java.util.Scanner;

/**
 *
 * @author Kamit
 */
public class ActividadAplicacion3_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Aplicación que dibuja el triángulo de Pascal, para n filas.");

        System.out.print("Introduzzca el número de filar (mayor a 0): ");
        
        int n = new Scanner(System.in).nextInt();

        if (n > 0) {

            for (int fila = 0; fila < n; fila++) {
                for (int elemento = 0; elemento <= fila; elemento++) {
                    int factN = 1;
                    for (int i = 1; i <= fila; i++) {
                        factN *= i;
                    }
                    int factM = 1;
                    for (int i = 1; i <= elemento; i++) {
                        factM *= i;
                    }

                    int factNMenosM = 1;
                    for (int i = 1; i <= fila - elemento; i++) {
                        factNMenosM *= i;
                    }

                    int valor = factN / (factM * factNMenosM);
                    System.out.print(valor + "  ");
                }
                System.out.println("");
            }

        } else {
            System.out.println("Error. Introduzca un número dentro del rango.");
        }
    }
}