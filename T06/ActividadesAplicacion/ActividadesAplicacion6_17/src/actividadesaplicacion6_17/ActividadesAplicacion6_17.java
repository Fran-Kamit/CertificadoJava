/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesaplicacion6_17;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadesAplicacion6_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Escriba una palabra: ");
        String palabra = new Scanner(System.in).nextLine();
        System.out.print("Tamaño de las secuencias: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("");
        
        while (!palabra.isEmpty()) {
            n = n<palabra.length() ? n : palabra.length();
             String linea = palabra.substring(0, n);
             palabra = palabra.substring(n);
             System.out.println(linea);
        }
    }
}