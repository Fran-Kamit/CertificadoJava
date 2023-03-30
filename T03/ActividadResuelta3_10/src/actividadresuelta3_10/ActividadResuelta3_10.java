/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta3_10;

/**
 *
 * @author JAVA
 */
public class ActividadResuelta3_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Mostrar la suma de los 10 primeros números impares.");
        
        int suma = 0, impar;
        
        for (int i = 1; i <= 10; i ++) {
            impar = 2 * i - 1;
            suma += impar;
        }
        System.out.println("La suma es: " + suma);
    }
}