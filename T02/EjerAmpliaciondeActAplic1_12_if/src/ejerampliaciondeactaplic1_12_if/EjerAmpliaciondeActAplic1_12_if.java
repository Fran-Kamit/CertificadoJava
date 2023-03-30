/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerampliaciondeactaplic1_12_if;

import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class EjerAmpliaciondeActAplic1_12_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, m, calculo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número entero: ");
        n = sc.nextInt();
        
        System.out.print("Introduzca el múltiplo a calcular: ");
        m = sc.nextInt();
        
       calculo = n % m;
       if (calculo == 0) {
           System.out.println("El número ya es múltiplo de " + m);
       } else {
           calculo = m - calculo;
           System.out.println("Hay que sumar " + calculo + " a " + n + " para que sea múltiplo de " + m);
       }
    }
}