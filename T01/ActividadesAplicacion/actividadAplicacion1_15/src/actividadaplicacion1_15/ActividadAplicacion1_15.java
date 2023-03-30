/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion1_15;
import java.util.*;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion1_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c, x, y;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("Dado el siguiente polinomio \"y=ax2+bx+c\"");
        System.out.print("Introduzca coeficiente de a: ");
        a = sc.nextDouble();
        
        System.out.print("Introduzca coeficiente de b: ");
        b = sc.nextDouble();
        
        System.out.print("Introduzca coeficiente de c: ");
        c = sc.nextDouble();
        
        System.out.print("Introduzca valor de x: ");
        x = sc.nextDouble();
        
        y = (a * (Math.pow(x, 2))) + (b * x) + c; // Math.pow sirve para elevar un nº.
        System.out.println("El resultado de y es: " + y);
    }
}