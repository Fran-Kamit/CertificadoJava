/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion1_11;
import java.util.*;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion1_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iva;
        double baseImponible, importeIva, importeTotal;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduzca base imponible: ");
        baseImponible = sc.nextDouble();
        
        System.out.print("Introduzca IVA: ");
        iva = sc.nextInt();
        
        importeIva = (baseImponible * iva) / 100;
        System.out.println("El importe del IVA es de " + importeIva + " €");
        
        importeTotal = baseImponible + importeIva;
        System.out.println("El importe total es de " + importeTotal + " €");
    }
}