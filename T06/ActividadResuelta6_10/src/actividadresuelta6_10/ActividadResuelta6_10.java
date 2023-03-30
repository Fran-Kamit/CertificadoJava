/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta6_10;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadResuelta6_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Realizar un programa que lea una frase del teclado "
                + "y nos indique si es palíndroma, es decir,\nque la frase sea "
                + "igual leyendo de izquierda a derecha, que de derecha a "
                + "izquierda, sin tener\nen cuenta los espacios.\n"
                + "Ej. «Dábale arroz a la zorra el abad».\n");
        
        Scanner sc = new Scanner(System.in);
        String frase, sinEspacios, invertida;
        
        System.out.print("Escriba una frase: ");
        frase = sc.nextLine();
        
        frase = frase.toLowerCase();
        
        sinEspacios = eliminaEspacios(frase);
        
        invertida = alReves(sinEspacios);
        
        if (sinEspacios.equals(invertida)) {
            System.out.println("La frase es palíndroma.");
        } else {
            System.out.println("La frase no es palíndroma.");
        }
    }
    
    static String eliminaEspacios(String frase) {
        String sin = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (!Character.isWhitespace(c)) {
                sin = sin + c;
            }
        }
        return sin;
    }
    
    static String alReves(String frase) {
        String nueva = "";
        for (int i = 0; i < frase.length(); i++) {
            nueva = frase.charAt(i) + nueva;
        }
        return nueva;
    }
}