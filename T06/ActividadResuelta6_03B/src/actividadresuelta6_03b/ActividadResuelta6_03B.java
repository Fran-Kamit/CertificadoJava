/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta6_03b;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadResuelta6_03B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Juego «Acierta la contraseña».\n"
                + "2ª versión. El programa mostrará la longitud de la "
                + "contraseña y una cadena con los\ncaracteres acertados en sus "
                + "lugares respectivos y asteriscos en os no acertados.\n");
        
        Scanner sc = new Scanner(System.in);
        String contr, palabra;
        
        System.out.print("Jugador 1. Introduzca la contraseña: ");
        contr = sc.nextLine();
        
        System.out.println("La contraseña tiene " + contr.length() + " caracteres.");
        
        System.out.print("Jugador 2. Palabra: ");
        palabra = sc.nextLine();
        
        while (!palabra.equals(contr)) {
            String pista = "";
            for (int i = 0; i < contr.length(); i++) {
                if (contr.charAt(i) == palabra.charAt(i)) {
                    pista += contr.charAt(i);
                } else {
                    pista += '*';
                }
            }
            System.out.println(pista);
            System.out.print("Jugador 2. Introduzca palabra de nuevo: ");
            palabra = sc.nextLine();
        }
        System.out.println("¡Acertaste!");
    }
}