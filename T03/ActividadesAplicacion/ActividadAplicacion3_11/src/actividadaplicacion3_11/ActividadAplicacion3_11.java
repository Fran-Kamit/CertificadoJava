/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion3_11;
import java.util.Scanner;

/**
 *
 * @author Kamit
 */
public class ActividadAplicacion3_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Conversión de decimal en binario.");

        Scanner sc = new Scanner(System.in);

        int n1, n2;
        String binario = "";

        System.out.print("Introduzca un número decimal mayor de 0: ");
        n1 = sc.nextInt();
        n2 = n1;

        if (n1 > 0) {

            while (n2 > 0) {
                if (n2 % 2 == 0) {
                    binario = "0" + binario;
                } else {
                    binario = "1" + binario;
                }
                n2 /= 2;
            }
            System.out.println("La conversión de " + n1 + " a binario es = " + binario);

        } else {
            System.out.println("Error. Número no válido.");
        }
    }
}