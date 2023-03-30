/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion4_11;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadAplicacion4_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Diseña una función que calcule y muestre la superficie "
                + "y el volumen de una esfera.\n");
        
        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);

        System.out.print("Introduzca el radio: ");
        double radio = sc.nextDouble();

        System.out.println("Superficie = " + superficie(radio));
        System.out.println("Volumen = " + volumen(radio));
    }

    // Función volumen
    static double volumen(double radio) {
        double volumen = (((4 * Math.PI) / 3) * (Math.pow(radio, 3)));
        return volumen;
    }
    
    // Función superficie
    static double superficie(double radio) {
        double superficie = ((4 * Math.PI) * (Math.pow(radio, 2)));
        return superficie;
    }
}