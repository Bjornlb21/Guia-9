package main;

import main.entidad.Curso;
import main.servicio.CursoServicio;


public class Main {

    public static void main(String[] args) {
        
        CursoServicio cs = new CursoServicio();
        
        Curso c = cs.crearCurso();
        
        cs.calcularGananciaSemanal(c);

    }

}
