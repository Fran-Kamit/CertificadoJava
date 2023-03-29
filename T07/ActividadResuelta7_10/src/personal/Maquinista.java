package personal;

public class Maquinista {
    String nombre;
    String dni;
    double sueldo;
    String rango;

    public Maquinista(String nombre, String dni, double sueldo, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    public void mostrarDatosMaquinista() {
        System.out.print("Nombre: " + nombre + ", DNI: " + dni + ",\n Sueldo: " + sueldo + " euros, Rango: " + rango);
    }
}