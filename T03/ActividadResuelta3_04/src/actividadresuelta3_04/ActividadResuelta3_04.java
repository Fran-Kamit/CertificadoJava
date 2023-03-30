/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta3_04;
import java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta3_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Aplicación que muestra cuál árbol es más alto."
                + "\nIntroducir la altura en centímetros."
                + "\nPara terminar la introducción de datos introduce \"-1\".");
        
        int etiqueta = 0, h, etiquetaMasAlto = 0, hMasAlto;
        
        System.out.print("Altura del árbol (" + etiqueta + "): ");
        h = sc.nextInt();
        
        hMasAlto = h;
        
        while (h != -1) {
            if (h > hMasAlto) {
                hMasAlto = h;
                etiquetaMasAlto = etiqueta;
            }
            etiqueta ++;
            System.out.print("Altura del árbol (" + etiqueta + "): ");
            h = sc.nextInt();
        }
        if (hMasAlto == -1) {
            System.out.println("No hay ningún árbol.");
        } else {
            System.out.println("El árbol más alto mide: " + hMasAlto + " cm."
                    + "\nLa etiqueta del árbol es: " + etiquetaMasAlto);
        }
    }
}