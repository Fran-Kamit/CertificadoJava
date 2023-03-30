/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta1_10;

import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class ActividadResuelta1_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean llueve, finalizadoTareas, irBiblioteca;
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Está lloviendo? (true/false): ");
        llueve = sc.nextBoolean();
        System.out.print("¿Has finalizado tus tareas? (true/false): ");
        finalizadoTareas = sc.nextBoolean();
        System.out.print("¿Tienes que ir a la biblioteca? (true/false): ");
        irBiblioteca = sc.nextBoolean();
        boolean salir = !llueve && finalizadoTareas || irBiblioteca;
        System.out.println("Puedes salir: " + salir);
    }
    
}
