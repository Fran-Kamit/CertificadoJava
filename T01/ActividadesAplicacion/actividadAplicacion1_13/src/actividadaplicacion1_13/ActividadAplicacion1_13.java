/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion1_13;
import java.util.Scanner;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion1_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, m, calculo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca el primer número entero: ");
        n = sc.nextInt();
        
        System.out.print("Introduzca el segundo número entero: ");
        m = sc.nextInt();
        
       calculo = n % m;
       if (calculo == 0) {
           System.out.println("El número ya es múltiplo de " + m);
       }else{
           calculo = m - calculo;
           System.out.println("Hay que sumar " + calculo + " a " + n + " para que sea múltiplo de " + m);
       }
    }
}