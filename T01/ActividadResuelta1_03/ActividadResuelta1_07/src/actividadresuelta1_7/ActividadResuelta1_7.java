/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta1_7;
import java.util.*;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta1_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio;
        double area, longitud;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //Para usar los decimales con "."
        System.out.print("Escribe el radio: ");
        radio = sc.nextDouble();
        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo es: " + area);
    }
    
}
