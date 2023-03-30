/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta1_9;
import java.util.*;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta1_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        System.out.print("Escriba un número: ");
        numero = new Scanner(System.in) .nextInt();
        boolean esPar = (numero % 2) == 0;
        System.out.println("Es par: " + esPar);
    }
    
}
