/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta6_02;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadResuelta6_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Primera frase: ");
        String frase1 = sc.nextLine();
        
        System.out.print("Segunda frase: ");
        String frase2 = sc.nextLine();
        
        int longFrase1 = frase1.length(), longFrase2 = frase2.length();
        
        if (longFrase1 == longFrase2) {
            System.out.println("Son de idéntica longitud");
        } else if (longFrase1 < longFrase2) {
            System.out.println(frase1 + " es más corta que " + frase2);
        } else {
            System.out.println(frase2 + " es más corta que " + frase1);
        }
    }
}