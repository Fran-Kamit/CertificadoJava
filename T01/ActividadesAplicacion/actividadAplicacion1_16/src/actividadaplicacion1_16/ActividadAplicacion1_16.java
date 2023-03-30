/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion1_16;
import java.util.Scanner;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion1_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, s, m, h;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce los segundos: ");
        n = sc.nextInt();
        
        s = n % 60;
        //System.out.println(s);
        
        m = n / 60;
        m= m % 60;
        //System.out.println(m);
        
        h = n / 3600;
        //System.out.println(h); 
        
        System.out.println(n + " en segundos son " + h + " horas, " + m + " minutos, y " + s + " segundos.");
    }
}