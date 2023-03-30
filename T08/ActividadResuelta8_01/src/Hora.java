public class Hora {
    protected int hora, minutos;
    protected String hora1, minutos1;
    
    Hora (int hora, int minutos) {
        this.hora = 0;
        this.minutos = 0;
        if (!setHora(hora)) {
            System.out.println("La hora es incorrecta.");
        }

        if (!setMinutos(minutos)) {
            System.out.println("La minutos no son válidos.");
        }
    }

    public void incrementar() {
        minutos++;
        if (minutos > 59) {
            minutos = 0;
            hora++;
            if (hora > 23) {
                hora = 0;
            }
        }
    }

    public boolean setHora(int hora){
        boolean correcto = false;
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
            correcto = true;
        }
        if (hora < 10) {
            hora1 = "0" + hora;
        }
        return correcto;
    }

    public boolean setMinutos(int minutos){
        boolean correcto = false;
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
            correcto = true;
        }
        if (minutos < 10) {
            minutos1 = "0" + minutos;
        }
        return correcto;
    }

    @Override
    public String toString() {
        String result = null;

        if (hora < 10 && minutos < 10) {
            result = hora1 + ":" + minutos1;
        } 
        else if (hora < 10) {
            result = hora1 + ":" + minutos;
        } 
        else if (minutos < 10) {
            result = hora + ":" + minutos1;
        }
        else {
            result = hora + ":" + minutos;
        }
        
        return result;
    }
}