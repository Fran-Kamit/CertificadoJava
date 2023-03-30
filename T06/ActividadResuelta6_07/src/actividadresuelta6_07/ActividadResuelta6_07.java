/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta6_07;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadResuelta6_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Programa que solicite al usuario una frase y una "
                + "palabra. A continuación buscará cuántas\nveces apaerece la "
                + "palabra en la frase.\n");
        
        Scanner sc = new Scanner(System.in);
        String frase, palabra;
        int cont = 0, posic;
        
        System.out.print("Introduzca una frase: ");
        frase = sc.nextLine();
        
        System.out.print("Introduzca una palabra: ");
        palabra = sc.nextLine();
        
        posic = frase.indexOf(palabra);
        while (posic != -1) {
            cont++;
            posic = frase.indexOf(palabra, posic + 1);
        }
        if (cont == 0) {
            System.out.println("\"" + palabra + "\" no se encuentra en la frase.");
        } else {
            System.out.println("\"" + palabra + "\" está " + cont + " veces.");
        }
    }
}