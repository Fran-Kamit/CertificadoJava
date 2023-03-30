/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion3_24;

import java.util.Locale;
import java.util.*;

/**
 *
 * @author Kamit
 */
public class ActividadAplicacion3_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Tenemos una empresa de melones y tenemos una máquina que categoriza los melones según su peso."
                + "\n Nos interesa diferenciar 3 tipos de tamaños (pequeños, normales y grandes), pero esos tamaños cada año son distintos,"
                + "\nasí que el operario de la máquina debe parametrizar ese peso cada vez que ponga en marcha la máquina."
                + "\n Tenemos que construir el programa que permita controlar este proceso y cuente cuántos melones han pasado por la máquina.\n");

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double pesoPeq, pesoMed, peso, kiloPeq = 0, kiloMed = 0, kiloGra = 0, contadorPeq = 0, contadorMed = 0, contadorGra = 0;

        System.out.print("Kilo máximo del melón pequeño: ");
        pesoPeq = sc.nextDouble();

        System.out.print("Kilo máximo del melón mediano: ");
        pesoMed = sc.nextDouble();

        if (pesoPeq > 0 && pesoMed > pesoPeq) {

            System.out.print("Introduzca el peso del melón: ");
            peso = sc.nextDouble();
            //Control
            while (peso <= 0) {
                System.out.println("Error. Introduzca otro número: ");
                peso = sc.nextDouble();
            }

            while (peso != 0) {

                if (peso > pesoMed) {
                    kiloGra += peso;
                    contadorGra++;
                } else if (peso > pesoPeq && peso <= pesoMed) {
                    kiloMed += peso;
                    contadorMed++;
                } else {
                    kiloPeq += peso;
                    contadorPeq++;
                }

                System.out.print("Introduzca el peso del melón: ");
                peso = sc.nextDouble();
                //Control
                while (peso < 0) {
                    System.out.println("Error. Introduzca otro número: ");
                    peso = sc.nextDouble();
                }

            }
            System.out.println("Melones pequeños: " + (int)contadorPeq + ". La media es = " + (kiloPeq / contadorPeq));
            System.out.println("Melones medianos: " + (int)contadorMed + ". La media es = " + (kiloMed / contadorMed));
            System.out.println("Melones grandes: " + (int)contadorGra + ". La media es = " + (kiloGra / contadorGra));

        } else {
            System.out.println("Error. Introduzca un rango válido de peso.");
        }
    }
}