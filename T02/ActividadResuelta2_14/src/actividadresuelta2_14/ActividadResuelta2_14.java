/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta2_14;
import java.util.Scanner;
/**
 *
 * @author Kamit
 */
public class ActividadResuelta2_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int diasDelMes, dia, mes, anyo;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca día: ");
        dia = sc.nextInt();
        
        System.out.print("Introduzca mes: ");
        mes = sc.nextInt();
        
        System.out.print("Introduzca año: ");
        anyo = sc.nextInt();
        
        diasDelMes = switch (mes) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
        dia++;
        
        if (dia > diasDelMes) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                anyo++;
            }
        }
        if (anyo == 0) {
            anyo =1;
        }
        System.out.println(dia + "/" + mes + "/" + anyo);
    }
    
}
