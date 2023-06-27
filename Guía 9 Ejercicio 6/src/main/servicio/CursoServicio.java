package main.servicio;

import java.util.Scanner;
import main.entidad.Curso;


public class CursoServicio {
    
    private final Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    //Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. 
    // Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, 
    //    solicitando en cada repetición que se ingrese el nombre de cada alumno.

    public String [] cargarAlumnos() {
        
        Curso curso = new Curso();
        
        System.out.println("");
        System.out.println("================== Crear Alumnos ==================");
        System.out.println("");
        
        String [] alumnos = new String[5];
        
        for (int i = 0; i < curso.getAlumnos().length; i++) {
            
            System.out.print("Ingrese el Nombre del Alumno [" + (i + 1) + "]: ");
            alumnos[i] = leer.next();
            
            System.out.println("");
        }
        
        System.out.println("===================================================");
        
        return alumnos;
    }
    
    // Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y 
    //    después se le asignan a sus respectivos atributos para llenar el objeto Curso. 
    // En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
    
    public Curso crearCurso() {
    
        Curso curso = new Curso();
        
        System.out.println("=================== Crear Curso ====================");
        System.out.println("");
        
        System.out.print("Ingrese el Turno del Curso (mañana/tarde): ");
        curso.setTurno(leer.next());
        
        System.out.println("");
        
        System.out.print("Ingrese las horas por día: ");
        curso.setCantidadHorasPorDia(leer.nextInt());
        
        System.out.println("");
        
        System.out.print("Ingrese los días por semana: ");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        
        System.out.println("");
        
        System.out.print("Ingrese el precio por hora: ");
        curso.setPrecioPorHora(leer.nextInt());
        
        System.out.println("");
        System.out.println("====================================================");
        
        curso.setAlumnos(cargarAlumnos());
        
        return curso;
    }

    // Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso.
    // Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y
    //    la cantidad de días a la semana que se repite el encuentro.
    
    public void calcularGananciaSemanal(Curso c) {
        
        int gananciaSemanal = c.getCantidadHorasPorDia() * c.getPrecioPorHora() * 5 * c.getCantidadDiasPorSemana();
        
        System.out.println("");
        
        System.out.println("La ganancia semanal del Profesor es de: [$" + gananciaSemanal + "].");
        
        System.out.println("");
    }
}
