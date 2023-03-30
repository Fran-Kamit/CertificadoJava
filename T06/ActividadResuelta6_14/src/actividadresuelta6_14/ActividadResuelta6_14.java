/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta6_14;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadResuelta6_14 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Implementar el juego del anagrama, que consiste en "
                + "que un jugador escribe una palabra y la aplicación muestra "
                + "un anagrama (cambio del orden de los caracteres) generado "
                + "al azar. A continuación, otro jugador tiene que acertar cuál "
                + "es el texto original. La aplicación no debe permitir que el "
                + "texto introducido por el jugador 1 sea una cadena vacía.\n");
        
        Scanner sc = new Scanner(System.in);
        String textoJugador1, intentoJugador2;
        
        do {
            System.out.print("Jugador 1. Introduzca una palabra: ");
            textoJugador1 = sc.next();
        } while (textoJugador1.isEmpty());
        
        System.out.println("\nA qué palabra corresponde el anagrama: " + creaAnagrama(textoJugador1));
        
        do {
            System.out.print("\nJugador 2. ¿Cuál es el original? ");
            intentoJugador2 = sc.next();
        } while (!textoJugador1.equals(intentoJugador2));
        
        System.out.println("¡Has acertado!");
    }
    
    static String creaAnagrama(String textoJugador1) {
        char anagrama[] = textoJugador1.toCharArray();
        
        for (int aleatorio = 0; aleatorio < anagrama.length; aleatorio++) {
            int i = (int)(Math.random() * anagrama.length);
            int j = (int)(Math.random() * anagrama.length);
            
            char auxiliar = anagrama[i];
            
            anagrama[i] = anagrama[j];
            anagrama[j] = auxiliar;
        }
        
        return String.valueOf(anagrama);
    }
}