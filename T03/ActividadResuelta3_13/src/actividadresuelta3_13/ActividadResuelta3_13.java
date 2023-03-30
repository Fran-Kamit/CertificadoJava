/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta3_13;
import java.util.Scanner;
/**
 *
 * @author Kamit
 */
public class ActividadResuelta3_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Dadas 6 notas, mostrar cuantos alumnos están "
                + "aprobados, condicionados y suspensos.");
        
        Scanner sc = new Scanner(System.in);
        
        int aprob = 0, susp = 0, cond = 0, nota;
        boolean error = false;
        
        for (int i = 1; i <= 6; i++) {
            System.out.print("Nota (0 al 10) del alumno número " + i + ": ");
            nota = sc.nextInt();
            if (nota == 4) {
                cond++;
            } else if (nota >= 5 && nota <= 10) {
                aprob++;
            } else if (nota < 4 && nota >= 0) {
                susp++;
            } else if (nota < 0 || nota > 10) {
                error = true;
                break;
            }
        }
        if (error == true) {
            System.out.println("Error. Nota no válida.");
        } else {
            System.out.println("Aprobados: " + aprob);
            System.out.println("Suspensos: " + susp);
            System.out.println("Condicionados " + cond);
        }
    }
}