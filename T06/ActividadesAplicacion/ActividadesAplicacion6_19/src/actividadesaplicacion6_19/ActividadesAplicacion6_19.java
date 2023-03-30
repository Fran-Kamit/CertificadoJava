/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesaplicacion6_19;

import java.util.*;

/**
 *
 * @author Administrador
 */
public class ActividadesAplicacion6_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba el texto: ");
        String texto = sc.nextLine();

        System.out.print("Palabra a sustituir: ");
        String sustituir = sc.nextLine();
        
        while (!sustituir.isEmpty()) {
            System.out.print("Por: ");
            String por = sc.nextLine();
            texto = texto.replaceAll(sustituir, por);
            System.out.println(texto);
            System.out.print("Palabra a sustituir: ");
            sustituir = sc.nextLine();
        }
    }
}
