/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion1_21;
import java.util.Scanner;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion1_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b;
        boolean igual;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        a = sc.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        b = sc.nextInt();
        
        igual = a == b;
         System.out.println("¿Son los números iguales? " + igual);
    }
}