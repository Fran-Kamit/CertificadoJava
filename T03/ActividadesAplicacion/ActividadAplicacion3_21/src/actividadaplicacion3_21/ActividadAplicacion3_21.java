/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion3_21;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion3_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Muestra por pantalla los últimos 20 números impares menores que 75, "
                + "indicando la posición (1, 2, 3, 4… 20).\nMuestra al final un mensaje indicando "
                + "cuál ha sido el último valor mostrado.");

        int contador20 = 0, num = 73;

        for (int i = num; contador20 < 20; i -= 2) {
                contador20++;
                System.out.println("El número " + i + " con valor " + contador20 + " es impar.");
        }
    }
}