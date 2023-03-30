/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta1_14;
import java.util.*;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta1_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n;
        int redondeo;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Escriba un número decimal: ");
        n = sc.nextDouble();
        redondeo = (int) (n + 0.5);
        
        System.out.println(n + " redondeo es: " + redondeo);
    }
}