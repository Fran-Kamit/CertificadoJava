/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta3_05;
import java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta3_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Juego de la suma en bucle."
                + "\nMientras el resultado sea correcto el juego continúa."
                + "\nSuma los siguientes números generados aleatoriamente del 1 al 100.");
        
        Scanner sc = new Scanner(System.in);
        
        int n1, n2, result, contador = 0;
        
        do {
            n1 = (int) (Math.random() * 100 + 1);
            n2 = (int) (Math.random() * 100 + 1);
            System.out.print(n1 + " + " + n2 + " = ");
            result = sc.nextInt();
            contador ++;
        } while (result == n1 + n2);
        
        System.out.println("A conseguido realizar: " + (contador - 1) + " sumas consecutivas.");
    }
}