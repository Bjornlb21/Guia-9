package main;

import main.entidad.MesesDelAño;
import main.servicio.MesesDelAñoServicio;

public class Main {

    public static void main(String[] args) {
        
        MesesDelAñoServicio msa = new MesesDelAñoServicio();

        MesesDelAño mda = new MesesDelAño();
        
        msa.adivinarMesSecreto(mda);
    }
}
