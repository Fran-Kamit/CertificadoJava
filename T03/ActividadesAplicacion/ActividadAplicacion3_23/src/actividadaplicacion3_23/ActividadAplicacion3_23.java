/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion3_23;

import java.util.Scanner;

/**
 *
 * @author Kamit
 */
public class ActividadAplicacion3_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Realizar un algoritmo que pida cuántos números se van a introducir y de ellos, "
                + "el programa debe mostrarnos al final,\ncuántos de los números introducidos son mayores que 0, "
                + "cuántos menores que 0 y cuantos iguales a 0.");

        Scanner sc = new Scanner(System.in);
        int numControl, numIntro, numMayor = 0, numMenor = 0, num0 = 0;

        System.out.print("¿Cuántos números va a introducir? ");
        numControl = sc.nextInt();

        if (numControl > 0) {
            
            for (int i = numControl; i > 0; i--) {
                System.out.print("Introduzca un número: ");
                numIntro = sc.nextInt();
                if (numIntro == 0) {
                    num0++;
                } 
                if (numIntro > 0) {
                    numMayor++;
                }
                if (numIntro < 0) {
                    numMenor++;
                }
            }
            System.out.println("Hay " + numMayor + " números mayores de 0.");
            System.out.println("Hay " + num0 + " números igual a 0");
            System.out.println("Hay " + numMenor + " números menores de 0.");
            
        } else {
            System.out.println("Error. Tiene que introducir al menos un número.");
        }

/*        if (numControl > 0) {
            
            
            
        } else {
            System.out.println("Error. Tiene que introducir al menos un número.");
        }
*/
    }
}