package examen1p2_carlosmurillo;

public class Personaje {
    private String nombre;
    int vida;
    private int escudo;
    private Arma arma;

    public Personaje() {
    }

    public Personaje(String nombre, int vida, int escudo, Arma arma) {
        this.nombre = nombre;
        this.vida = vida;
        this.escudo = escudo;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", vida=" + vida + ", escudo=" + escudo + ", arma=" + arma + '}';
    }
    
    
    
}
