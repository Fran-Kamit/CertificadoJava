/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta3_11;
import java.util.*;

/**
 *
 * @author Kamit
 */
public class ActividadResuelta3_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Factorial de un número.");
        
        Scanner sc = new Scanner(System.in);
        
        int n;
        double facto;
        
        System.out.print("Introduzca un número mayor de 0: ");
        n = sc.nextInt();
        
        if (n > 0) {
            facto = 1;
            for (int i = n; i > 0; i--) {
                facto = facto * i;
            }
            System.out.println("El " + n + "! es: " + facto);
        } else {
            System.out.println("Error. Introduzca un número válido.");
        }
    }
}