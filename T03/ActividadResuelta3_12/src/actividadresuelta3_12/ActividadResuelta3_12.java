/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta3_12;
import java.util.Scanner;
/**
 *
 * @author Kamit
 */
public class ActividadResuelta3_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pedir 5 calificaciones y decir si hay algún suspenso.");
        
        Scanner sc = new Scanner(System.in);
        
        boolean susp = false, error = false;
        
        int notas;
        
        for (int i = 0; i < 5; i++){
            System.out.print("Introduzca nota (0 a 10): ");
            notas = sc.nextInt();
            if (notas >= 0 && notas < 5) {
                susp = true;
            } else if ( notas < 0 || notas > 10){
                error = true;
                break;
            }
        }
        if (error == true) {
            System.out.println("Error. Nota no válida.");
        } else if (susp) {
            System.out.println("Hay alumnos suspensos.");
        } else {
            System.out.println("No hay alumnos suspensos.");
        }
    }
}