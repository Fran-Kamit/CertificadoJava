/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta3_06;
import java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta3_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Aplicación para aprender a contar."
                + "\nSe mostrarán los números del 1 a n.");
        
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.print("Introduzca un número mayor a cero: ");
        n = sc.nextInt();
        
        if (n > 0) {
            for (int i = 1; i <= n; i++){
                System.out.println(i);
            }
        } else {
            System.out.println("Error. Introduce un número dentro del rango.");
        }
    }
}