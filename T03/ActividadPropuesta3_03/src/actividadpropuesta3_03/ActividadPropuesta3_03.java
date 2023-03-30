/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadpropuesta3_03;
import java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadPropuesta3_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guarismo de números.");
        int n;
        
        System.out.print("Introduce un número mayor a 0: ");
        n = sc.nextInt();
        
        if (n > 0) {
          for (int i = n; i > 0; i /= 10){
            System.out.println(i % 10);
        }  
        } else {
            System.out.println("Error. Introduzca un número dentro del rango.");
        }
    }
}