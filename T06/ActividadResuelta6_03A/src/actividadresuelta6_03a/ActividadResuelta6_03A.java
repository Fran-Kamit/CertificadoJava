/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta6_03a;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadResuelta6_03A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Juego «Acierta la contraseña»."
                + "\n1ª versión. El programa indica si la palabra "
                + "introducida es mayor o menor alfabéticamente\nque la "
                + "contraseña.\n");
        
        Scanner sc = new Scanner(System.in);
        
        String contr, palabra;
        
        System.out.print("Jugador 1. Introduzca la contraseña: ");
        contr = sc.nextLine();
        
        do {
            System.out.print("Jugador 2. Palabra: ");
            palabra = sc.nextLine();
            int compara = contr.compareTo(palabra);
            if ( compara == 0) {
                System.out.println("¡Acertaste!");
            } else if (compara < 0){
                System.out.println("La contraseña es menor que: " + palabra);
            } else {
                System.out.println("La contraseña es mayor que: " + palabra);
            }
        } while (!contr.equals(palabra));
    }
}