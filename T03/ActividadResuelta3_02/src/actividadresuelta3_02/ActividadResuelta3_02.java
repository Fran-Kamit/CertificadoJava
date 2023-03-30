/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta3_02;
import java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta3_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int edad, sumaEdades = 0, contMayores = 0, contadorAlumnos = 0;
        boolean mayorEdad;
        double media;
        
        System.out.print("Introduzca la edad del alumno: ");
        edad = sc.nextInt();
        
        while (edad >= 0){
            sumaEdades += edad;
            contadorAlumnos ++;
            
            mayorEdad = edad >= 18;
            if (mayorEdad == true){
                contMayores ++;
            }
            System.out.print("Introduzca la edad del alumno: ");
            edad = sc.nextInt();
        }
        media = (double) sumaEdades/contMayores;
        
        System.out.println("La suma de todas las edades: " + sumaEdades);
        System.out.println("Media: " + media);
        System.out.println("Número total de alumnos: " + contadorAlumnos);
        System.out.println("Mayores de edad: " + contMayores);
    }
}