/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion3_16;
import java.util.Scanner;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion3_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        
        int filasTotales = sc.nextInt();
        
        for (int filas = 1 ; filas <= filasTotales; filas++) {
            for (int espacio = 1; espacio <= (filasTotales - filas); espacio++) {
                System.out.print(" ");
            }
            for (int asterisco = 1; asterisco <= filas; asterisco++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    } 
}