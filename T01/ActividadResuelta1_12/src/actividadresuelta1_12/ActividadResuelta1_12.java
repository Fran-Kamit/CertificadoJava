/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta1_12;
import java.util.*;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta1_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un número (positivo o negativo): ");
        
        int n = sc.nextInt();
        int valorAbsoluto = n < 0 ? -1 * n : n;
        
        System.out.println("El valor absoluto de " + n + " es " + valorAbsoluto);
    }
    
}
