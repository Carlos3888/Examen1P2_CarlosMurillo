package examen1p2_carlosmurillo;

public class Arma {
    private String nombre;
    private int presicion;
    private int daño;

    public Arma() {
    }

    public Arma(String nombre, int presicion, int daño) {
        this.nombre = nombre;
        this.presicion = presicion;
        this.daño = daño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPresicion() {
        return presicion;
    }

    public void setPresicion(int presicion) {
        this.presicion = presicion;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
