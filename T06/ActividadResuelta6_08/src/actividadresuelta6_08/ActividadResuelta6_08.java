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
                + "extraño; cuando hablan siempre comenzando\nsus frases con "
                + "«Javalín, javalón», para después hacer una pausa más o menos "
                + "larga y a\ncontinuación expresan el mensaje. Existe un dialecto "
                + "que no comienza sus frases con la\nmuletilla anterior, pero "
                + "siempre las terminan con un silencio más o menos prolongado y "
                + "la\ncoletilla «javalén, len, len». Se pide diseñar un traductor "
                + "que, en primer lugar, nos diga\nsi la frase introducida está "
                + "escrita en el idioma de Javalandia (en cualquiera de sus "
                + "dialectos),\ny en caso afirmativo, nos muestre solo el mensaje "
                + "sin muletillas.\n");

        Scanner sc = new Scanner(System.in);
        final String PREFIJO = "Javalín, javalón";
        final String SUFIJO = "javalén, len, len";
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
            System.out.println("No está escrito en el idioma de Javalandia.");
        }
    }
}