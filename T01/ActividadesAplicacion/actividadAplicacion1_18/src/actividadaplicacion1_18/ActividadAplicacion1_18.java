/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion1_18;
import java.util.Scanner;
/**
 *
 * @author Kamit
 */
public class ActividadAplicacion1_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horm, ara, cochi, total;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca el nº de hormigas capturadas: ");
        horm = sc.nextInt();
        
        System.out.print("Introduzca el nº de arañas capturadas: ");
        ara = sc.nextInt();
        
        System.out.print("Introduzca el nº de cochinillas capturadas: ");
        cochi = sc.nextInt();
        
        if (horm >= 0 && ara >= 0 && cochi >= 0){
            horm = horm * 6;
            ara = ara * 8;
            cochi = cochi * 14;
        
            total= horm + ara + cochi;
        
            System.out.println("El nº total de patas es: " + total);
        }else{
            System.out.println("Introduzca un nº mayor o igual a 0.");
        }
    }
}