package personal;

public class Mecanico {
    String nombre;
    String telefono;

    enum Especialidad {
        FRENOS, HIDRAÚLICA, ELECTRICIDAD, MOTOR
    }

    Especialidad especialidad;

    public Mecanico(String nombre, String telefono, Especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = Especialidad.valueOf(especialidad);
    }
}