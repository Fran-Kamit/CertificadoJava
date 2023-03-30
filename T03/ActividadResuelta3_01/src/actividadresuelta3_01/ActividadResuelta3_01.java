/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta3_01;
import java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta3_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        boolean esPar, esPositivo;
        
        System.out.print("Introduzca un número: ");
        n = sc.nextInt();
        
        while (n != 0){
            esPar = n % 2 == 0;
            esPositivo = n >= 0;
            
            System.out.println("¿Es par? " + esPar + "\n¿Es positivo? " + esPositivo);
            System.out.println("Cuadrado: " + n * n);
            System.out.print("Introduzca otro número: ");
            n = sc.nextInt();
        }
    }
}