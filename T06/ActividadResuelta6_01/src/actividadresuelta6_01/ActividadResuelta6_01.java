/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta6_01;

/**
 *
 * @author Administrador
 */
public class ActividadResuelta6_01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++) {
            String x = Integer.toHexString(codePoint);
            System.out.println("\\u" + x + ": " + (char)codePoint);
        }
    }
}