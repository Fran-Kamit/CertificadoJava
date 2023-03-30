/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadaplicacion2_12;

import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class ActividadAplicacion2_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dni, resto;
        String letra = null;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cálculo de la letra del DNI.");

        System.out.print("Introduzca los 8 dígitos del DNI: ");
        dni = sc.nextInt();

        resto = dni % 23;
        switch (resto) {
            case 0 ->
                letra = "T";
            case 1 ->
                letra = "R";
            case 2 ->
                letra = "W";
            case 3 ->
                letra = "A";
            case 4 ->
                letra = "G";
            case 5 ->
                letra = "M";
            case 6 ->
                letra = "Y";
            case 7 ->
                letra = "F";
            case 8 ->
                letra = "P";
            case 9 ->
                letra = "D";
            case 10 ->
                letra = "X";
            case 11 ->
                letra = "B";
            case 12 ->
                letra = "N";
            case 13 ->
                letra = "J";
            case 14 ->
                letra = "Z";
            case 15 ->
                letra = "S";
            case 16 ->
                letra = "Q";
            case 17 ->
                letra = "V";
            case 18 ->
                letra = "H";
            case 19 ->
                letra = "L";
            case 20 ->
                letra = "C";
            case 21 ->
                letra = "K";
            case 22 ->
                letra = "E";
        }
        if (letra != null && dni >= 0 && dni <= 99999999) {
            System.out.println("El " + dni + " tiene la letra " + letra);
        } else {
            System.out.println("El número no es correcto.");
        }
    }
}