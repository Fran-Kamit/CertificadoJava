/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadpropuesta2_04;
import java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadPropuesta2_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        boolean multiplo;
        
        System.out.print("Introduce el primer número: ");
        a = sc.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        b= sc.nextInt();
        
        multiplo = a % b == 0;
        
        System.out.println("¿" + a + " es múltiplo de " + b + "? " + multiplo);
    }
}