/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion2_13;
import java.util.*;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion2_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        int numAnimales;
        double comidaDiaria, kilosPorAnimal, comidaFalta, racionAnimal;
        
        System.out.println("Ejercicio de la granja. ¿Disponemos de suficiente alimento?");
        
        System.out.print("Introduzca la cantidad de comida diaria comprada: ");
        comidaDiaria = sc.nextDouble();
        
        System.out.print("Introduzca la cantidad de animales: ");
        numAnimales = sc.nextInt();
        
        System.out.print("Introduzca (en kilos) la cantidad que come cada animal: ");
        kilosPorAnimal = sc.nextDouble();
        
        if (comidaDiaria <= 0 || numAnimales <= 0 || kilosPorAnimal <= 0) {
            System.out.println("Error. Introduzca un valor válido.");
        } else {
            if (comidaDiaria < numAnimales * kilosPorAnimal) {
                comidaFalta = numAnimales * kilosPorAnimal - comidaDiaria;
                System.out.println("No hay suficiente comida. Faltan " + comidaFalta + " kilos.");
                racionAnimal = kilosPorAnimal / numAnimales;
                System.out.println("La ración correspondiente es de " + racionAnimal + " kilos por cada animal.");
            } else {
                System.out.println("Hay suficiente comida.");
            }
        }
    }  
}