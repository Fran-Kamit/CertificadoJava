/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadpropuesta2_03;
import java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadPropuesta2_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.print("Introduzca un número: ");
        a = sc.nextInt();
        
        System.out.print("Introduzca otro número: ");
        b = sc.nextInt();
        
        boolean distintos;
        distintos = a != b || a == 0 || b == 0;
        
        System.out.println("¿Son distintos o alguno de ellos vale 0? " + distintos);
    }
}