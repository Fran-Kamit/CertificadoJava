public class MarcaPagina {
    private int ultimaPagina;

    public MarcaPagina() {
        ultimaPagina = 1;
    }

    void incrementarPagina() {
        ultimaPagina++;
    }

    void comenzar() {
        ultimaPagina = 1;
    }

    int ultimaPaginaLeida() {
        return ultimaPagina;
    }

}