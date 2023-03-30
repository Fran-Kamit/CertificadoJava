/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta6_08;
import java.util.*;
/**
 *
 * @author Kamit
 */
public class ActividadResuelta6_08 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Los habitantes de Javalandia tiene un idioma algo "
                + "extra�o; cuando hablan siempre comenzando\nsus frases con "
                + "�Javal�n, javal�n�, para despu�s hacer una pausa m�s o menos "
                + "larga y a\ncontinuaci�n expresan el mensaje. Existe un dialecto "
                + "que no comienza sus frases con la\nmuletilla anterior, pero "
                + "siempre las terminan con un silencio m�s o menos prolongado y "
                + "la\ncoletilla �javal�n, len, len�. Se pide dise�ar un traductor "
                + "que, en primer lugar, nos diga\nsi la frase introducida est� "
                + "escrita en el idioma de Javalandia (en cualquiera de sus "
                + "dialectos),\ny en caso afirmativo, nos muestre solo el mensaje "
                + "sin muletillas.\n");

        Scanner sc = new Scanner(System.in);
        final String PREFIJO = "Javal�n, javal�n";
        final String SUFIJO = "javal�n, len, len";
        String entrada;
        boolean idiomaJavalandia = false;

        System.out.print("Escriba una frase: ");
        entrada = sc.nextLine();

        if (entrada.startsWith(PREFIJO)) {
            idiomaJavalandia = true;
            entrada = entrada.substring(PREFIJO.length());
        } else if (entrada.endsWith(SUFIJO)) {
            idiomaJavalandia = true;
            entrada = entrada.substring(0, entrada.length() - SUFIJO.length());
        }

        if (idiomaJavalandia) {
            entrada = entrada.strip();
            System.out.println(entrada);
        } else {
            System.out.println("No est� escrito en el idioma de Javalandia.");
        }
    }
}