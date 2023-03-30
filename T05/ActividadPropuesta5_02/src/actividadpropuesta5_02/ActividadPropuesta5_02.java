/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadpropuesta5_02;

/**
 *
 * @author Fran
 */
public class ActividadPropuesta5_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tabla[] = new int [10];
        
        int tabla3[] = tabla;
        int tabla5[] = tabla;
        
        System.out.println("Espacio en memoria de tabla es = " + tabla);
        System.out.println("Espacio en memoria de tabla3 es = " + tabla3);
        System.out.println("Espacio en memoria de tabla5 es = " + tabla5);
        
    }
}