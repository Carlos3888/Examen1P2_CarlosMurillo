package examen1p2_carlosmurillo;

public class Usuario {
    private String nombre;
    private int id;
    private String contra;
    private Fortaleza personajeF;
    private Medico personajeM;
    private Rastreador personajeR;

    public Usuario() {
    }

    public Usuario(String nombre, int id, String contra, Fortaleza personajeF) {
        this.nombre = nombre;
        this.id = id;
        this.contra = contra;
        this.personajeF = personajeF;
    }

    public Usuario(String nombre, int id, String contra, Medico personajeM) {
        this.nombre = nombre;
        this.id = id;
        this.contra = contra;
        this.personajeM = personajeM;
    }

    public Usuario(String nombre, int id, String contra, Rastreador personajeR) {
        this.nombre = nombre;
        this.id = id;
        this.contra = contra;
        this.personajeR = personajeR;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Fortaleza getPersonajeF() {
        return personajeF;
    }

    public void setPersonajeF(Fortaleza personajeF) {
        this.personajeF = personajeF;
    }

    public Medico getPersonajeM() {
        return personajeM;
    }

    public void setPersonajeM(Medico personajeM) {
        this.personajeM = personajeM;
    }

    public Rastreador getPersonajeR() {
        return personajeR;
    }

    public void setPersonajeR(Rastreador personajeR) {
        this.personajeR = personajeR;
    }
    

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
