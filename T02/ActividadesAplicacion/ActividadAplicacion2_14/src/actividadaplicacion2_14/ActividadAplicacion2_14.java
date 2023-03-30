/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion2_14;

import java.util.Scanner;

/**
 *
 * @author Kamit
 */
public class ActividadAplicacion2_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        String nLetras = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entre el 1 y 99: ");
        n = sc.nextInt();

        if (n < 1 || n > 99) {
            System.out.println("Error. Introduzca un número dentro del rango.");
        } else {
            switch (n) {
                case 1 ->
                    nLetras = "\"uno\".";
                case 2 ->
                    nLetras = "\"dos\".";
                case 3 ->
                    nLetras = "\"tres\".";
                case 4 ->
                    nLetras = "\"cuatro\".";
                case 5 ->
                    nLetras = "\"cinco\".";
                case 6 ->
                    nLetras = "\"seis\".";
                case 7 ->
                    nLetras = "\"siete\".";
                case 8 ->
                    nLetras = "\"ocho\".";
                case 9 ->
                    nLetras = "\"nueve\".";
                case 10 ->
                    nLetras = "\"diez\".";
                case 11 ->
                    nLetras = "\"once\".";
                case 12 ->
                    nLetras = "\"doce\".";
                case 13 ->
                    nLetras = "\"trece\".";
                case 14 ->
                    nLetras = "\"catorce\".";
                case 15 ->
                    nLetras = "\"quince\".";
                case 16 ->
                    nLetras = "\"dieciséis\".";
                case 17 ->
                    nLetras = "\"diecisiete\".";
                case 18 ->
                    nLetras = "\"dieciocho\".";
                case 19 ->
                    nLetras = "\"diecinueve\".";
                case 20 ->
                    nLetras = "\"veinte\".";
                case 21 ->
                    nLetras = "\"veiniuno\".";
                case 22 ->
                    nLetras = "\"veintidós\".";
                case 23 ->
                    nLetras = "\"veintitres\".";
                case 24 ->
                    nLetras = "\"veinticuatro\".";
                case 25 ->
                    nLetras = "\"veinticinco\".";
                case 26 ->
                    nLetras = "\"veintiseis\".";
                case 27 ->
                    nLetras = "\"veintisiete\".";
                case 28 ->
                    nLetras = "\"veintiocho\".";
                case 29 ->
                    nLetras = "\"veintinueve\".";
                case 30 ->
                    nLetras = "\"treinta\".";
                case 31 ->
                    nLetras = "\"treinta y uno\".";
                case 32 ->
                    nLetras = "\"treinta y dos\".";
                case 33 ->
                    nLetras = "\"treinta y tres\".";
                case 34 ->
                    nLetras = "\"treinta y cuatro\".";
                case 35 ->
                    nLetras = "\"treinta y cinco\".";
                case 36 ->
                    nLetras = "\"treinta y seis\".";
                case 37 ->
                    nLetras = "\"treinta y siete\".";
                case 38 ->
                    nLetras = "\"treinta y ocho\".";
                case 39 ->
                    nLetras = "\"treinta y nueve\".";
                case 40 ->
                    nLetras = "\"cuarenta\".";
                case 41 ->
                    nLetras = "\"cuarenta y uno\".";
                case 42 ->
                    nLetras = "\"cuarenta y dos\".";
                case 43 ->
                    nLetras = "\"cuarenta y tres\".";
                case 44 ->
                    nLetras = "\"cuarenta y cuatro\".";
                case 45 ->
                    nLetras = "\"cuarenta y cinco\".";
                case 46 ->
                    nLetras = "\"cuarenta y seis\".";
                case 47 ->
                    nLetras = "\"cuarenta y siete\".";
                case 48 ->
                    nLetras = "\"cuarenta y ocho\".";
                case 49 ->
                    nLetras = "\"cuarenta y nueve\".";
                case 50 ->
                    nLetras = "\"cincuenta\".";
                case 51 ->
                    nLetras = "\"cincuenta y uno\".";
                case 52 ->
                    nLetras = "\"cincuenta y dos\".";
                case 53 ->
                    nLetras = "\"cincuenta y tres\".";
                case 54 ->
                    nLetras = "\"cincuenta y cuatro\".";
                case 55 ->
                    nLetras = "\"cincuenta y cinco\".";
                case 56 ->
                    nLetras = "\"cincuenta y seis\".";
                case 57 ->
                    nLetras = "\"cincuenta y siete\".";
                case 58 ->
                    nLetras = "\"cincuenta y ocho\".";
                case 59 ->
                    nLetras = "\"cincuenta y nueve\".";
                case 60 ->
                    nLetras = "\"sesenta\".";
                case 61 ->
                    nLetras = "\"sesenta y uno\".";
                case 62 ->
                    nLetras = "\"sesenta y dos\".";
                case 63 ->
                    nLetras = "\"sesenta y tres\".";
                case 64 ->
                    nLetras = "\"sesenta y cuatro\".";
                case 65 ->
                    nLetras = "\"sesenta y cinco\".";
                case 66 ->
                    nLetras = "\"sesenta y seis\".";
                case 67 ->
                    nLetras = "\"sesenta y siete\".";
                case 68 ->
                    nLetras = "\"sesenta y ocho\".";
                case 69 ->
                    nLetras = "\"sesenta y nueve\".";
                case 70 ->
                    nLetras = "\"setenta\".";
                case 71 ->
                    nLetras = "\"setenta y uno\".";
                case 72 ->
                    nLetras = "\"setenta y dos\".";
                case 73 ->
                    nLetras = "\"setenta y tres\".";
                case 74 ->
                    nLetras = "\"setenta y cuatro\".";
                case 75 ->
                    nLetras = "\"setenta y cinco\".";
                case 76 ->
                    nLetras = "\"setenta y seis\".";
                case 77 ->
                    nLetras = "\"setenta y siete\".";
                case 78 ->
                    nLetras = "\"setenta y ocho\".";
                case 79 ->
                    nLetras = "\"setenta y nueve\".";
                case 80 ->
                    nLetras = "\"ochenta\".";
                case 81 ->
                    nLetras = "\"ochenta y uno\".";
                case 82 ->
                    nLetras = "\"ochenta y dos\".";
                case 83 ->
                    nLetras = "\"ochenta y tres\".";
                case 84 ->
                    nLetras = "\"ochenta y cuatro\".";
                case 85 ->
                    nLetras = "\"ochenta y cinco\".";
                case 86 ->
                    nLetras = "\"ochenta y seis\".";
                case 87 ->
                    nLetras = "\"ochenta y siete\".";
                case 88 ->
                    nLetras = "\"ochenta y ocho\".";
                case 89 ->
                    nLetras = "\"ochenta y nueve\".";
                case 90 ->
                    nLetras = "\"noventa\".";
                case 91 ->
                    nLetras = "\"noventa y uno\".";
                case 92 ->
                    nLetras = "\"noventa y dos\".";
                case 93 ->
                    nLetras = "\"noventa y tres\".";
                case 94 ->
                    nLetras = "\"noventa y cuatro\".";
                case 95 ->
                    nLetras = "\"noventa y cinco\".";
                case 96 ->
                    nLetras = "\"noventa y seis\".";
                case 97 ->
                    nLetras = "\"noventa y siete\".";
                case 98 ->
                    nLetras = "\"noventa y ocho\".";
                case 99 ->
                    nLetras = "\"noventa y nueve\".";
            }
            System.out.println("El número " + n + " es " + nLetras);
        }
    }
}