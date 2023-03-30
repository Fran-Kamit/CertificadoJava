/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion2_15;
import java.util.*;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion2_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        double base, altura, area;
        
        System.out.println("Cálculo del área de un triángulo.");
        
        System.out.print("Introduce la base: ");
        base = sc.nextDouble();
        
        System.out.print("Introduce la altura: ");
        altura = sc.nextDouble();
        
        if (base < 0 || altura < 0){
            System.out.println("Error. La base y/o la altura no pueden ser inferiores a 0.");
        } else {
            area = (base * altura) / 2;
            System.out.println("El área del triángulo es " + area);
        }
    }
}