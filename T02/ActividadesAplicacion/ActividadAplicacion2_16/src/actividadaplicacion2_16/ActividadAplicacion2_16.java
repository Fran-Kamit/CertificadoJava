/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion2_16;
import  java.util.*;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion2_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        double n1, n2;
        
        System.out.println("Valor absoluto de un número.");
        
        System.out.print("Introduzca un número: ");
        n1 = sc.nextDouble();
        
        if (n1 >= 0) {
            System.out.println("El valor absoluto de " + n1 + " es " + n1);
        } else {
            n2 = n1 * -1;
            System.out.println("El valor absoluto de " + n1 + " es " + n2);
        }
    }
}