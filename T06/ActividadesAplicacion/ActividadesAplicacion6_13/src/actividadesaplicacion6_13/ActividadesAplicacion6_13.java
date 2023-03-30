/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesaplicacion6_13;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadesAplicacion6_13 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escriba una sentencia: ");
        String sentencia = sc.nextLine() .toLowerCase();
        
        final String PARAMETRO1 = "/*", PARAMETRO2 = "*/";
        int pos1, pos2, contador = 0;
        
        while (sentencia.indexOf(PARAMETRO1) != -1) {
            
            while (contador < sentencia.length()) {
                pos1 = sentencia.indexOf(PARAMETRO1);
                pos2 = sentencia.indexOf(PARAMETRO2);
                String frase1 = sentencia.substring(0, pos1);
                String frase2 = sentencia.substring(pos2 + 2, sentencia.length());
                sentencia = frase1 + frase2;
                contador = pos1;
            }
        }
        System.out.println(sentencia);
    }
}