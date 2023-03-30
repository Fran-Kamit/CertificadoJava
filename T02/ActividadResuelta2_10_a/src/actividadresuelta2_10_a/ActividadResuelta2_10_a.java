/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta2_10_a;
import java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta2_10_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una nota comprendida entre 0 y 10: ");
        nota = sc.nextInt();
        
        if (0 <= nota && nota < 5) {
            System.out.println("Insuficiente.");
        } else if (nota == 5) {
            System.out.println("Suficiente.");
        } else if (nota == 6){
            System.out.println("Bien");
        } else if (nota == 7 || nota == 8) {
            System.out.println("Notable.");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Sobresaliente.");
        } else {
            System.out.println("Error: Nota no válida.");
        }
    }
}