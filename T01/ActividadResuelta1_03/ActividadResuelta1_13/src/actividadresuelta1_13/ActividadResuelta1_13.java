/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta1_13;

import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class ActividadResuelta1_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota1, nota2, nota3;
        int mediaBoletin;
        double mediaExpediente;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota primer trimestre: ");
        nota1 = sc.nextInt();
        System.out.print("Nota segundo trimestre: ");
        nota2 = sc.nextInt();
        System.out.print("Nota tercer trimestre: ");
        nota3 = sc.nextInt();
        
        mediaExpediente = (nota1 + nota2 + nota3) / 3.0;
        
        mediaBoletin = (int) mediaExpediente;
        
        System.out.println("Boletín de calificaciones: " + mediaBoletin);
        System.out.println("Expediente académico: " + mediaExpediente);
    }
    
}
