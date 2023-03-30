/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion3_12;

import java.util.Scanner;

/**
 *
 * @author Kamit
 */
public class ActividadAplicacion3_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Conversión de binario a decimal.");

        Scanner sc = new Scanner(System.in);

        /*
        int n1, n2, expon = 0, d = 0;
        
        System.out.print("Introduzca un número binario mayor de 0: ");
        n1 = sc.nextInt();
        n2 = n1;
        
        while (n2 != 0) {
            d = d + (n2 % 2) * (int)Math.pow(2,expon);
            n2 = n2 / 10;
            expon++;
        }
        System.out.println("La conversión de " + n1 + " a decimal es = " + d);
         */
        
        int binario1, binario2, decimal = 0, base = 1;

        System.out.print("Introduzca un número binario mayor de 0: ");
        binario1 = sc.nextInt();

        binario2 = binario1;
        
        if (binario1 > 0) {
            
            while (binario2 != 0) {
            int unidBinaria = binario2 % 2;
            binario2 /= 10;
            decimal += base * unidBinaria;
            base = base * 2;
        }
        System.out.println("La conversión de " + binario1 + " a decimal es = " + decimal);
        
        } else {
            System.out.println("Error. Número no válido.");
        }
    }
}