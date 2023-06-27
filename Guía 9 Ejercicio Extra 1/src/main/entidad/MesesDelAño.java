package main.entidad;

public class MesesDelAño {

    private final String[] meses;
    private final String mesSecreto;

    public MesesDelAño() {
        
        this.meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
                                  "octubre", "noviembre", "diciembre"};
        this.mesSecreto = meses[6];
    }

    public MesesDelAño(String[] meses, String mesSecreto) {
        this.meses = meses;
        this.mesSecreto = mesSecreto;
    }

    public String[] getMeses() {
        return meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
}
