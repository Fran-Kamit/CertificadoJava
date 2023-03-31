public class Calendario {
    private int dia, mes, anyo, compDia, compMes, compAnyo;
    private boolean comprobacion;

    public Calendario(){
    }

    public Calendario(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    ////* Caso 1*////
    public int incrementarDia() {
        this.dia++;
        /* Comprobación mes de 31 días */
        if (this.dia == 32 && (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12)) {
            this.dia = 1;
            this.mes++;
            if (this.mes == 13) {
                this.mes = 1;
                this.anyo++;
            }
            if (this.anyo == 0) {
                this.anyo++;
            }
        }
        /* Comprobación mes de 30 días */
        if (this.dia == 31 && (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)) {
            this.dia = 1;
            this.mes++;
            if (this.mes == 13) {
                this.mes = 1;
                this.anyo++;
            }
            if (this.anyo == 0) {
                this.anyo++;
            }
        }
        /* Comprobación mes febrero no bisiesto */
        if (this.dia == 29 && this.mes == 2 && this.anyo % 4 != 0) {
            this.dia = 1;
            this.mes++;
            if (this.mes == 13) {
                this.mes = 1;
                this.anyo++;
            }
            if (this.anyo == 0) {
                this.anyo++;
            }
        }
        /* Comprobar mes febrero bisiesto */
        if (this.dia == 30 && this.mes == 2 && this.anyo % 4 == 0) {
            this.dia = 1;
            this.mes++;
            if (this.mes == 13) {
                this.mes = 1;
                this.anyo++;
            }
            if (this.anyo == 0) {
                this.anyo++;
            }
        }
        return this.dia;
    }

    ////* Caso 2*////
    public int incrementarMes() {
        this.mes++;
        if (this.mes == 13) {
            this.mes = 1;
            this.anyo++;
            if (this.anyo == 0) {
                this.anyo++;
            }
        }
        return this.mes;
    }

    ////* Caso 3*////
    public int incrementarAnyo(int increAnyo) {
        for (int i = 0; i < increAnyo; i++) {
            if (this.anyo == 0) {
                this.anyo++;
            }
            this.anyo++;
        }
        return this.anyo;
    }

    ////* Comprobación del caso 4*////
    public boolean iguales(int compdia, int compmes, int companyo) {
        this.compDia = compdia;
        this.compMes = compmes;
        this.compAnyo = companyo;

        if (dia == compDia && mes == compMes && anyo == compAnyo) {
            comprobacion = true;
        } else {
            comprobacion = false;
        }
        return comprobacion;
    }

    public String comprueba() {
        return comprobacion ? "Si." : "No.";
    }
    /////////////////////////////////

    ////* Caso 5*////
    public void mostrar() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.anyo);
    }
}