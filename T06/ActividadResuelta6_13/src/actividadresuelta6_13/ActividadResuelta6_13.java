/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta6_13;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadResuelta6_13 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Dise�ar un algoritmo que lea del teclado una frase "
                + "e indique, para cada letra que aparece\nen la frase, cu�ntas "
                + "veces se repite. Se consideran iguales las letras may�sculas "
                + "y las\nmin�sculas para realizar la cuenta.\n");
        
        Scanner sc = new Scanner(System.in);
        String frase;
        int [] numVeces;
        
        System.out.print("Intrduzca una frase: ");
        frase = sc.nextLine() .toLowerCase();
        
        numVeces = new int ['z' - 'a' + 1];
        
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i))) {
                numVeces[frase.charAt(i) - 'a']++;
            }
        }
        
        for (int i = 0; i < 'z' - 'a' + 1; i++) {
            if (numVeces[i] != 0) {
                System.out.println("La letra " + (char) (i + 'a') + ""
                        + " se repite " + numVeces[i] + " veces.");
            }
        }
    }
}