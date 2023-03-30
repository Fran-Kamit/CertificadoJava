/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion3_22;
import java.util.Scanner;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion3_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Mostrar los números entre 5000 y 8000, imprimir cuantos son múltiplos de 3 "
                + "y pares al mismo tiempo.");
        
        int multiplo2 = 0, multiplo3 = 0, parYMultiplos = 0;
        
        for (int num = 5001; num > 5000 && num < 8000; num++) {
            if (num % 3 == 0) {
                System.out.println("El número " + num + " es múltiplo de 3.");
                multiplo3++;
            }
            if (num % 2 == 0) {
                System.out.println("El número " + num + " es múltiplo de 2.");
                multiplo2++;
            }
            if (num % 2 == 0 && num % 3 == 0) {
                System.out.println("El número " + num + " es múltiplo de 2 y 3.");
                parYMultiplos++;
            }
        }
        System.out.println("Total múltiplo de 3 = " + multiplo3);
        System.out.println("Total múltiplos de 2 = " + multiplo2);
        System.out.println("Total que son múltiplos de 2 y 3: " + parYMultiplos);
    } 
}