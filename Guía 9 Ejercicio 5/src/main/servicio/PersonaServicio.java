package main.servicio;

import java.util.*;
import main.entidad.Persona;


public class PersonaServicio {

    // Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
    // Retornar el objeto Persona creado.
    public Persona crearPersona() {
    
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        Persona persona = new Persona();
        
        System.out.print("Ingrese su Nombre: ");
        persona.setNombre(leer.next());
        
        System.out.println("");
        
        System.out.println("Ingrese su Fecha de Nacimiento (DD/MM/AAAA): ");
        System.out.print(">: ");
        int dia = leer.nextInt();
        
        System.out.print(">: ");
        int mes = leer.nextInt();
        
        System.out.print(">: ");
        int year = leer.nextInt();
        
        persona.setFechaNacimiento(new Date(year - 1900, mes - 1, dia));
        
        System.out.println("");
        
        return persona;
    }
    
    // Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
    public int calcularEdad(Persona p) {
        
        System.out.println("");
    
        return new Date().getYear() - p.getFechaNacimiento().getYear();
    }
    
    // Método menorQue recibe como parámetro una Persona y una edad. 
    // Retorna true si la persona es menor que la edad consultada o false en caso contrario
    
    public String menorQue(Persona p, int edad) {
    
        return calcularEdad(p) < edad ? "Sí" : "No";
    }
    
    // Método mostrarPersona que muestra la información de la persona deseada.
    public void mostrarPersona(Persona p) {
        
        System.out.println("============ Datos de la Persona ============");
        System.out.println("");
    
        System.out.println("Nombre: " + p.getNombre());
        
        System.out.println("");
        
        System.out.println("Fecha de Nacimiento: " + p.getFechaNacimiento().toGMTString());
        
        System.out.println("Edad: " + calcularEdad(p));
        
        System.out.println("");
        System.out.println("=============================================");
    }
}
