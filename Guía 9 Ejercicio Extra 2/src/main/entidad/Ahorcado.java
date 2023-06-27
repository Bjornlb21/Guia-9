package main.entidad;

// Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con la palabra a buscar, 
//    la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario.

public class Ahorcado {

    private String[] palabraBuscada;
    private int letrasEncontradas, jugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraBuscada, int letrasEncontradas, int jugadasMaximas) {
        this.palabraBuscada = palabraBuscada;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public String[] getPalabraBuscada() {
        return palabraBuscada;
    }

    public void setPalabraBuscada(String[] palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }
}
