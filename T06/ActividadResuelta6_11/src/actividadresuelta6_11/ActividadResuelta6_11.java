/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta6_11;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadResuelta6_11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Se dispone la siguiente relación de letras:\n"
                + "Conjunto 1: |e|i|k|m|p|q|r|s|t|u|v|\n"
                + "Contunjo 2: |p|v|i|u|m|t|e|r|k|q|s|\n"
                + " Con ella es posible codificar un texto, convirtiendo cada "
                + "letra del conjunto 1 en su\ncorrespondiente del conjunto 2. "
                + "El resto de las letras no se modifican. Los conjuntos se\n"
                + "utilizan tanto para codificar mayúsculas como minúsculas, "
                + "mostrando siempre la codificación\nen minúsculas.\n"
                + " Realiza un programa que codifique un texto.\n");
        
        Scanner sc = new Scanner(System.in);
        final char CONJUNTO1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        final char CONJUNTO2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        char textoCodificado[];
        String texto;
        
        System.out.print("Introduzca un texto a codificar: ");
        texto = sc.nextLine();
        texto = texto.toLowerCase();
        
        textoCodificado = new char[texto.length()];
        
        for (int i = 0; i < texto.length(); i++) {
            textoCodificado[i] = codificador(CONJUNTO1, CONJUNTO2, texto.charAt(i));
        }
        System.out.println("Texto codificado: " + String.valueOf(textoCodificado));
    }
    
    static char codificador(char CONJUNTO1[], char CONJUNTO2[], char x) {
        final String CONJ1 = String.valueOf(CONJUNTO1);
        char textoCodificado;
        int posic = CONJ1.indexOf(x);
        
        if (posic == -1) {
            textoCodificado = x;
        } else {
            textoCodificado = CONJUNTO2[posic];
        }
        return textoCodificado;
    }
}