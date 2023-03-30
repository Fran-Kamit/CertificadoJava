/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion4_13;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadAplicacion4_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Crea la función que muestre por consola los primeros"
                + " \"n\" números pares.\n");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca cuantos números pares quiere mostrar: ");
        int n = sc.nextInt();
        
        muestraPares(n);
        
    }
    
    static void muestraPares(int n) {
        int num = 0;
        for (int i = 0; i < n; i++) {
            num += 2;
            System.out.print(num + " ");
        }
        System.out.println();
    }
}