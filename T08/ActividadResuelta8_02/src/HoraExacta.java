public class HoraExacta extends Hora {
    protected int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        this.segundos = segundos;

        if (!setSegundos(segundos)) {
            System.out.println("Segundos incorrectos.");
        }
    }

    public boolean setSegundos(int segundos) {
        boolean correcto = false;
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
            correcto = true;
        }
        return correcto;
    }
    
    @Override
    public void incrementar() {
        segundos++;
        if (segundos > 59) {
            segundos = 0;
            super.incrementar();
        }
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += ":" + segundos;
        return result;
    }
}