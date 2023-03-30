/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta3_14;

/**
 *
 * @author Kamit
 */
public class ActividadResuelta3_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Aplicación que muestra las tablas del 1 al 10.");
        
        for (int tabla = 1; tabla <= 10; tabla++) {
            System.out.println("\nTabla del " + tabla);
            for (int i = 1; i <= 10; i++) {
                System.out.println(tabla + " x " + i + " = " + tabla * i);
            }
        } System.out.print("\n");
    }
}