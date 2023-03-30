/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta2_11;
import java.util.Scanner;
/**
 *
 * @author Kamit
 */
public class ActividadResuelta2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número de 1 a 7: ");
        dia = sc.nextInt();
        
        switch (dia) {
            case 1 ->
                System.out.println("Lunes");
            case 2 ->
                System.out.println("Martes");
            case 3 ->
                System.out.println("Miércoles");
            case 4 ->
                System.out.println("Jueves");
            case 5 ->
                System.out.println("Viernes");
            case 6 ->
                System.out.println("Sábado");
            case 7 ->
                System.out.println("Domingo");
            default ->
                System.out.println("Error. Introduzca del 1 al 7");                        
        }
    }
}