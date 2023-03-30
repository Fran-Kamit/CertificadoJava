/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta3_08;
import  java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta3_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Media de diez números introducidos.");
        
        Scanner sc = new Scanner(System.in);
        int n, total = 0;
        double media;
        
        for (int i = 1; i <= 10; i++){
            System.out.print("Escribe un número: ");
            n = sc.nextInt();
            total += n;
        }
        media = (double)total /10;
        System.out.println("La media es: " + media);
    }
}