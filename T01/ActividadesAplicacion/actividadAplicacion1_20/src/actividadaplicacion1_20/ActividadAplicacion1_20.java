/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion1_20;
import  java.util.*;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion1_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n, raiz;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduce un número real: ");
        n = sc.nextDouble();
        
        if (n >= 0){
            raiz = Math.sqrt(n);
            System.out.println("La raíz cuadrada de " + n + " es " + raiz);
        }else{
            System.out.println("La raíz cuadrada de " + n + " no existe.");
        }
    }
}