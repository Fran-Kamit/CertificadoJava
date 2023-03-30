/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadaplicacion2_11;
import java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadAplicacion2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, unidades, decenas, centenas, unidMillar;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Número capicúa.");
        
        System.out.print("Introduzca un número entre 0 y 9999: ");
        n = sc.nextInt();
        
        unidades = n % 10;
        decenas = n % 100 / 10;
        centenas = n % 1000 / 100;
        unidMillar = n % 10000 / 1000;
        
        if (n < 0 && n > 9999) {
            System.out.println("Error. Introduce un número válido dentro del rango.");
        } else {
            if (n >= 0 && n < 10) {
                System.out.println("Es capicúa.");
            } else {
                if (decenas == unidades && centenas == 0 && unidMillar == 0) {
                    System.out.println("Es capicúa.");
                } else if (centenas == unidades && unidMillar == 0) {
                    System.out.println("Es capicúa.");
                } else if (unidMillar == unidades && centenas == decenas) {
                    System.out.println("Es capicúa.");
                } else {
                    System.out.println("No es capicúa.");
                }
            }
        }
    }
}