/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion1_12;
import java.util.Scanner;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion1_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, calculo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número entero: ");
        n = sc.nextInt();
        
       calculo = n % 7;
       if (calculo == 0) {
           System.out.println("El número ya es múltiplo de 7");
       }else{
           calculo = 7 - calculo;
           System.out.println("Hay que sumar " + calculo + " a " + n + " para que sea múltiplo de 7");
       }
    }
}