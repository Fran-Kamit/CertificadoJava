/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion4_15;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadAplicacion4_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Diseña una funció a la que se le pasan las horas y "
                + "minutos de dos instantes de tiempo.\nLa función devolverá la "
                + "cantidad de minutos que existen de diferencia entre los dos"
                + "\ninstantes utilizados.\n");
        
        Scanner sc = new Scanner(System.in);
        int hora1, min1, hora2, min2;
        
        System.out.println("Primer instante de tiempo.");
        
        System.out.print("Introduzca horas: ");
        hora1 = sc.nextInt();
        
        do {
            System.out.print("Introduzca minutos (entre 0 y 59): ");
            min1 = sc.nextInt();
        } while (min1 < 0 || min1 > 59);
        
        
        System.out.println("\nSegundo instante de tiempo.");
        
        System.out.print("Introduzca horas: ");
        hora2 = sc.nextInt();
        
        do {
            System.out.print("Introduzca minutos (entre 0 y 59): ");
            min2 = sc.nextInt();
        } while (min2 < 0 || min2 > 59);
        
        System.out.println("\nDiferencia entre los dos instantes = " + diferenciaMin(hora1, min1, hora2, min2) + " minutos.");
    }
    
    static int diferenciaMin(int hora1, int min1, int hora2, int min2) {
        int diferenciaMin;
        int minutos1 = hora1 * 60 + min1;
        int minutos2 = hora2 * 60 + min2;
        
        if (minutos1 >= minutos2) {
            diferenciaMin = minutos1 - minutos2;
        } else {
            diferenciaMin = minutos2 - minutos1;
        }
        return diferenciaMin;
    }
}