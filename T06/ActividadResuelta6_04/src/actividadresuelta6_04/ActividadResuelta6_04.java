/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta6_04;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadResuelta6_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Aplicación que pide al usuario que introduzca "
                + "una frase por teclado e indique cuántos \nespacios en blanco "
                + "tiene.\n");
        
        Scanner sc = new Scanner(System.in);
        String frase;
        int numEspaciosBlanco = 0;
        char c;
        
        System.out.print("Escriba una frase: ");
        frase = sc.nextLine();
        
        for (int i = 0; i < frase.length(); i++) {
            c = frase.charAt(i);
            if (Character.isSpaceChar(c)) {
                numEspaciosBlanco ++;
            }
        }
        System.out.println("Tiene: " + numEspaciosBlanco + " espacios en blanco.");
    }
}