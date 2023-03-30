/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion1_19;
import java.util.*;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion1_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entInfantil, entAdulto;
        double entInfantil1, entAdulto1, total, totalDesc;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduce cuantas entradas infantiles necesitas: ");
        entInfantil = sc.nextInt();
        
        System.out.print("Introduce cuantas entradas para adultos necesitas: ");
        entAdulto = sc.nextInt();
        
        entInfantil1 = entInfantil * 15.50;
        entAdulto1 = entAdulto * 20;
        total = entAdulto1 + entInfantil1;
        
        if (total >= 100){
            totalDesc = (total * 5) / 100;
            total = total - totalDesc;
            System.out.println("El total a pagar con un 5% de descuento es de " + total + " €.");
        }else{
            System.out.println("El total a pagar es de " + total + " €.");
        }
    }
}