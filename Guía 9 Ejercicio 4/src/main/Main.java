package main;

import main.servicio.FechaServicio;


public class Main {

    public static void main(String[] args) {
        
        FechaServicio fs = new FechaServicio();
        
        System.out.println(fs.diferencia(fs.fechaNacimiento(), fs.fechaActual()));
    }
}
