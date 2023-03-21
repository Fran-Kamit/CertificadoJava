public class CuentaCorriente {
    String dni;
    public String nombre;
    public double saldo;
    static private String nombreBanco = "International Java Bank";
    Gestor gestor;

    CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    CuentaCorriente(String dni, double saldo) {
        this.dni = dni;
        this.nombre = "Sin asignar";
        this.saldo = saldo;
    }

    CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    boolean egreso(double cant) {
        boolean operacionPosible;
        if (saldo >= cant) {
            saldo -= cant;
            operacionPosible = true;
        } else {
            System.out.println("No hay dinero suficiente");
            operacionPosible = false;
        }
        return (operacionPosible);
    }

    void ingreso(double cant) {
        saldo += cant;
    }

    CuentaCorriente(String dni, String nombre, Gestor gestor) {
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0;
        this.gestor = gestor;
    }

    void mostrarInformacion() {
        if (gestor == null) {
            System.out.println("Cuenta sin gestor");
        } else {
            System.out.println("Informacion del gestor");
            gestor.mostrarInformacion();
        }
        System.out.println("Información de la cuenta");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dni: " + dni);
        System.out.println("Saldo: " + saldo + " euros");
        System.out.println(nombreBanco);
    }

    static void setBanco(String nuevoNombre) {
        nombreBanco = nuevoNombre;
    }

    static String getBanco() {
        return nombreBanco;
    }
}