/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadfinal_16;
import java.util.*;
/**
 *
 * @author JAVA
 */
public class ActividadFinal_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iva;
        double baseImponible, importeIva, importeTotal;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduzca la base imponible: ");
        baseImponible = sc.nextDouble();
        
        System.out.print("Introduzca el IVA: ");
        iva = sc.nextInt();
        
        importeIva = baseImponible * iva / 100;
        System.out.println("El importe de IVA es " + importeIva + " €");
        
        importeTotal = baseImponible + importeIva;
        System.out.println("El importe total es " + importeTotal + " €");
    }
}