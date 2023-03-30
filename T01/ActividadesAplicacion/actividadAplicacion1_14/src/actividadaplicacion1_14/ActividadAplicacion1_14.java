/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion1_14;
import java.util.*;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion1_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base, altura, areaTriangulo;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduzca la base del triángulo: ");
        base = sc.nextDouble();
        
        System.out.print("Introduzca la altura del triángulo: ");
        altura = sc.nextDouble();
        
        areaTriangulo = (base * altura) / 2;
        
        System.out.println("El área del triángulo es: " + areaTriangulo);
    }
}