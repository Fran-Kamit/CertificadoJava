/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion1_22;
import java.util.*;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion1_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double m;
        int cm;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduce la distancia en metros: ");
        m = sc.nextDouble();
        m = m * 100;
        
        cm = (int) m;
        
        System.out.println("La distancia del lanzamiento es de " + cm + " cm.");
    }   
}