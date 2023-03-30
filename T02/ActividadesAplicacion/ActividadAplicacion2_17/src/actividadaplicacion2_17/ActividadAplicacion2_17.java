/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion2_17;
import java.util.Scanner;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion2_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rand1, rand2, suma, n;
        
        System.out.println("Juego de la suma. Suma los siguientes números:");
        
        rand1 = (int)(Math.random() * 99 + 1);
        rand2 = (int)(Math.random() * 99 + 1);
        suma = rand1 + rand2;
        
        System.out.println("Número 1: " + rand1);
        System.out.println("Número 2: " + rand2);
        
        System.out.print("Introduce el resultado: ");
        n = sc.nextInt();
        
        if (suma == n){
            System.out.println("La suma es correcta.");
        } else {
            System.out.println("La suma es incorrecta.");
        }
    }
}