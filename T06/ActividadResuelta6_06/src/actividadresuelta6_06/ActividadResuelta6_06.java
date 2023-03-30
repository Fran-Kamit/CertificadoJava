/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta6_06;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadResuelta6_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Escribir un programa que pida el nombre completo "
                + "al usuario y lo muestre sin vocales.\n");
        
        Scanner sc = new Scanner(System.in);
        String nombre, sinVocales = "";
        char a;
        
        System.out.print("Escriba su nombre completo: ");
        nombre = sc.nextLine();
        
        for (int i = 0; i < nombre.length(); i++) {
            a = nombre.charAt(i);
            if (!esVocal(a)) {
                sinVocales = sinVocales + a;
            }
        }
        System.out.println(sinVocales);
    }
    
    static boolean esVocal(char a) {
        boolean result;
        String vocales = "aeiouáéíóúàèìòùäëïöü";
        a = Character.toLowerCase(a);
        
        if (vocales.indexOf(a) == -1) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }
}