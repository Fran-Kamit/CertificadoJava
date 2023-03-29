import java.util.Arrays;

import maquinaria.Locomotora;
import maquinaria.Tren;
import maquinaria.Vagon;
import personal.JefeEstacion;
import personal.Maquinista;
import personal.Mecanico;

public class App {
    public static void main(String[] args) throws Exception {
        Maquinista maq1, maq2;
        Mecanico mec1, mec2;
        JefeEstacion jefes1, jefes2;
        Vagon vag1, vag2;
        Locomotora loc1, loc2;
        Tren tren1, tren2;

        maq1 = new Maquinista("Maquinista Avelino", "12345678-A", 2500.0, "3");    
    //    System.out.println(); maq1.mostrarDatosMaquinista();
        maq2 = new Maquinista("Maquinista Pepa", "98765432-B", 3500.0, "7");
    //    System.out.println(); maq2.mostrarDatosMaquinista();

        mec1 = new Mecanico("Mecánico Juan", "600010101", "MOTOR");
    //    System.out.println(); mec1.mostrarDatosMecanico();
        mec2 = new Mecanico("Mecánica Luisa", "600020304", "HIDRAÚLICA");
    //    System.out.println(); mec2.mostrarDatosMecanico();

    
    }
}