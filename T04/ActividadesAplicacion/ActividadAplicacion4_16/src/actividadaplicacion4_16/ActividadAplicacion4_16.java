/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion4_16;
import java.util.*;

/**
 *
 * @author Administrador
 */
public class ActividadAplicacion4_16 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Implementa la función \"divisoresPrimos()\" que muestra, "
                + "por consola, todos los divisores\nprimos del número que se le "
                + "pasa como parámetro.\n");

        Scanner sc = new Scanner(System.in);
        int numElegido;

        do {
            System.out.print("Introduzca un número mayor que 1: ");
            numElegido = sc.nextInt();
        } while (numElegido <= 1);

        System.out.println("\nLos divisores primos de " + numElegido + " son "
                + "los siguientes números: ");
        divisoresPrimos(numElegido);
    }

    static void divisoresPrimos(int numElegido) {
        for (int num = 2; num <= numElegido; num++) {
            boolean esPrimo = true;
            int i = 2;
            
            /*Saber si son primos o no.*/
            while (i < num && esPrimo) {
                if (num % i == 0) {
                    esPrimo = false;
                }
                i++;
            }
            /*Nos muestre los números primos.*/
            if (numElegido % num == 0 && esPrimo){
                    System.out.print(num + " ");
                }else{}
        }
        System.out.println("");
    }
}