/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion3_17;
import java.util.Scanner;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion3_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      System.out.print("Escriba el primer número: ");
      int num1 = new Scanner(System.in).nextInt();
      
      System.out.print("Escriba el segundo número: ");
      int num2 = new Scanner(System.in).nextInt();

      int mcd = num1 < num2 ? num1 : num2;
      boolean encontrado = false;

      while (mcd >= 1 && !encontrado) {
         if (num1 % mcd == 0 && num2 % mcd == 0) {
            encontrado = true;
            System.out.println("El mcd es: " + mcd);
         }
         mcd--;
      }

    }
    
}
