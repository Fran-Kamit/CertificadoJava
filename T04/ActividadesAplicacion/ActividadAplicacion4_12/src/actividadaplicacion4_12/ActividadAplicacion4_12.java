/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion4_12;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadAplicacion4_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Implementa la función que calcula y devuelve la distancia "
                + "euclídea que separa los puntos (x1, y1) y (x2, y2).\n");
        
        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);
        
        System.out.print("Introduzca el valor de x1= ");
        double x1 = sc.nextDouble();
        
        System.out.print("Introduzca el valor de y1= ");
        double y1 = sc.nextDouble();
        
        System.out.print("Introduzca el valor de x2= ");
        double x2 = sc.nextDouble();
        
        System.out.print("Introduzca el valor de y2= ");
        double y2 = sc.nextDouble();
        
        System.out.println("Distancia euclídea de (" + x1 + ", " + y1 + ") y "
                + "(" + x2 + ", " + y2 + ") = " + distancia(x1, y1, x2, y2));
        
    }
    
    static double distancia(double x1, double y1, double x2, double y2) {
       double distancia = Math.sqrt( (Math.pow(x1 - x2, 2)) + (Math.pow(y1 - y2, 2)) );
       return distancia;
    } 
}