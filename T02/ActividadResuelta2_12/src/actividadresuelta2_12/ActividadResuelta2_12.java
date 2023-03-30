/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta2_12;
import java.util.Scanner;
/**
 *
 * @author Kamit
 */
public class ActividadResuelta2_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia, mes, anyo;
        boolean fechaCorrecta;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca día: ");
        dia = sc.nextInt();
        
        System.out.print("Introduzca mes: ");
        mes = sc.nextInt();
        
        System.out.print("Introduzca año: ");
        anyo = sc.nextInt();
        
        if (anyo == 0){
            fechaCorrecta = false;
        } else {
            if (mes == 2 && (1 <= dia && dia <=28)) {
                fechaCorrecta = true;
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (1 <= dia && dia <=30)){
                fechaCorrecta = true;
            } else {
                if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (1 <= dia && dia <= 31)) {
                    fechaCorrecta = true;
                } else {
                    fechaCorrecta = false;
                }
            }
            if (fechaCorrecta) {
                System.out.println("Fecha OK: " + dia + "/" + mes + "/" + anyo);
            } else {
                System.out.println("Fecha incorrecta.");
            }
        }
    }
}