/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta2_13;
import java.util.Scanner;
/**
 *
 * @author Kamit
 */
public class ActividadResuelta2_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h, m, s;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca hora: ");
        h = sc.nextInt();
        
        System.out.print("Introduzca minutos: ");
        m = sc.nextInt();
        
        System.out.print("Introduzca segundos: ");
        s = sc.nextInt();
        
        s++;
        if (s > 59) {
            s = 0;
            m++;
            if (m > 59) {
                m = 0;
                h++;
                if (h > 23) {
                    h = 0;
                }
            }
        }
        System.out.println("Hora + 1 segundo: " + h + ":" + m + ":" +s);
    }
}