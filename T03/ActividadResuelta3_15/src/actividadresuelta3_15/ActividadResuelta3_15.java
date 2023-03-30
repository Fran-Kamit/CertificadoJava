/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta3_15;
import java.util.Scanner;
/**
 *
 * @author Kamit
 */
public class ActividadResuelta3_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introducir un número y dibujar un triángulo rectángulo "
                + "de n elementos de lado utilizando asteriscos.\n");
        
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.print("Escriba un número mayor de 0: ");
        n = sc.nextInt();
        System.out.print("\n");
        
        if (n > 0){
            for (int fila = 1; fila <= n; fila++) {
                for (int colum = fila; colum <= n; colum++) {
                    System.out.print("* ");
                }
                System.out.println("");
            } System.out.print("\n");
        } else {
            System.out.println("Error. El número tiene que ser mayor de 0. ");
        }
    }
}