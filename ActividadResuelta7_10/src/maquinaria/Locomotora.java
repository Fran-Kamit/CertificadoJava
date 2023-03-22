package maquinaria;
import personal.Mecanico;

public class Locomotora {
    String matricula;
    int potencia;
    int anyoFabricacion;
    Mecanico mec;

    public Locomotora(String matricula, int potencia, int anyoFabricacion, Mecanico mec) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anyoFabricacion = anyoFabricacion;
        this.mec = mec;
    }
}