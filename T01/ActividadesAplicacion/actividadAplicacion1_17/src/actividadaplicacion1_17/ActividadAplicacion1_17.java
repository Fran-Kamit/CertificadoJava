/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion1_17;
import java.util.*;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion1_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double mm, cm, m, sumaLongitud;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduce medida en milímetros: ");
        mm = sc.nextDouble();
        
        System.out.print("Introduce medida en centrímetros: ");
        cm = sc.nextDouble();
        
        System.out.print("Introduce medida en metros: ");
        m = sc.nextDouble();
        
        mm = mm / 10;
        m = m * 100;
        
        sumaLongitud = m + cm + mm;
        
        System.out.println("La suma de las longitudes dan: " + sumaLongitud + " cm.");
    }
}