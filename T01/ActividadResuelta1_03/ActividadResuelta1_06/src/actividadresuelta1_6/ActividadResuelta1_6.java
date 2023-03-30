/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta1_6;

import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class ActividadResuelta1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota1, nota2;
        double media;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: ");
        nota1 = sc.nextInt();
        System.out.print("Nota 2: ");
        nota2 = sc.nextInt();
        media = (nota1 + nota2) / 2.0;
        System.out.println("La media es: " + media);
    }
    
}
