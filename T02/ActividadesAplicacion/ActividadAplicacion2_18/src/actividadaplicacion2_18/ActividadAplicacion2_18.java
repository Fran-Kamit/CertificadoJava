/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion2_18;
import java.util.Scanner;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion2_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rand1, rand2, rand3, n1, result = 0;
        String operMat = null;
        
        System.out.println("Juego de las operaciones matemáticas. Suma, resta o multiplica los siguientes números:");
        
        rand1 = (int)(Math.random() * 99 + 1);
        rand2 = (int)(Math.random() * 99 + 1);
        rand3 = (int)(Math.random() * 3);
        
        switch (rand3) {
            case 0:
                operMat = "Suma";
                result = rand1 + rand2;
                break;
            case 1:
                operMat = "Resta";
                result = rand1 - rand2;
                break;
            case 2:
                operMat = "Multiplica";
                result = rand1 * rand2;
                break;                
        }
        
        System.out.print(operMat);
        System.out.print(" el número " + rand1);
        System.out.println(" y el número " + rand2);
               
        System.out.print("Introduce el resultado: ");
        n1 = sc.nextInt();
        
        if (result == n1){
            System.out.println("El resultado es correcto.");
        } else {
            System.out.println("El resultado es incorrecto.");
        }
    }
}