/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta6_09;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadResuelta6_09 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Introducir por teclado una frase palabra a palabra, "
                + "y mostrar la frase completa separando\nlas palabras introducidas "
                + "con espacios en blanco. Terminar de leer la frase cuando alguna"
                + "\nde las palabras introducidas sea la cadena «fin» escrita con "
                + "cualquier combinación de\nmayúsculas y minúsculas. La cadena "
                + "«fin» no aparecerá en la frase final.\n");
        
        Scanner sc = new Scanner(System.in);
        String frase = "", palabra;
        
        System.out.print("Escriba una palabra: ");
        palabra = sc.next();
        
        while (!palabra.toLowerCase().equals("fin")) {
            frase = frase + " " + palabra;
            System.out.print("Escribe una palabra: ");
            palabra = sc.next();
        }
        System.out.println("\n" + frase);
    }
}