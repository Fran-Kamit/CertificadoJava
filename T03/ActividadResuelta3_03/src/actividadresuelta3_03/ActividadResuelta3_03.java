/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta3_03;
import java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta3_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Juego del número secreto. Hay que acertar un número aleatorio entre 1 y 100."
                + "\nPara rendirte escribe \"-1\"");
        
        int num, numSecreto;
        
        numSecreto = (int) (Math.random() * 100 + 1);

        System.out.print("Introduzca un número entre el 1 y el 100: ");
        num = sc.nextInt();
        
        while (numSecreto != num && num != -1) {
            if (numSecreto < num) {
                System.out.println("El número generado es menor a " + num);
            } else {
                System.out.println("El número generado es mayor a " + num);
            }
            System.out.print("Introduzca otro número: ");
            num = sc.nextInt();
        }
        if (numSecreto == num) {
            System.out.println("¡Has acertado! :D");
        } else {
            System.out.println("Otra vez será... D:");
        }
    }
}