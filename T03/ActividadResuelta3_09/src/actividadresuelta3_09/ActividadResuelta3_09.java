/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta3_09;
import java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta3_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Mostrar la tabla de multiplicar elegida de la 1 a la 10.");
        
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        do {
            System.out.print("Introduce un número del 1 al 10: ");
            n = sc.nextInt();
        } while (n < 1 || n > 10);
        System.out.println("\nTabla del " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}