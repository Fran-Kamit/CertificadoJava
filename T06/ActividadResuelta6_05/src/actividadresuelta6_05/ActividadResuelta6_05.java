/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta6_05;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadResuelta6_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Diseña una función a la que se le pase una cadena "
                + "de caracteres y la devuelva invertida.\n");
        
        Scanner sc = new Scanner(System.in);
        String frase;
        
        System.out.print("Escriba una frase: ");
        frase = sc.nextLine();
                
        alReves(frase);
    }
    static void alReves(String frase) {
        String nueva = "";
        for (int i = 0; i < frase.length(); i++) {
            nueva = frase.charAt(i) + nueva;
        }
        System.out.println(nueva);
    }
}