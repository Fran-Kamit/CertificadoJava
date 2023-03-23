public class Calendario {
    int dia;
    int mes;
    int anyo;

    public Calendario(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;

    }
    

    public void mostrar() {
        System.out.println(dia + "/" + mes + "/" + anyo);
    }
}