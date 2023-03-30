/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta2_06;
import java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta2_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        n1 = sc.nextInt();
        
        System.out.print("Introduzca otro número: ");
        n2 = sc.nextInt();
        
        if (n1 == n2) {
            System.out.println("Son iguales.");
        } else {
            if (n1 > n2) {
                System.out.println(n1 + " es mayor que " + n2);
            } else {
                System.out.println(n2 + " es mayor que " + n1);
            }
        }
    }
}