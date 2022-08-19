package examen1p2_carlosmurillo;

public class Fortaleza extends Personaje{
    private int dano_extra = super.getArma().getDaño()/100*10;
    private int reduccion_dano = 0;

    public Fortaleza() {
    }

    public Fortaleza(String nombre, int vida, int escudo, Arma arma) {
        super(nombre, vida, escudo, arma);
    }

    public int getDano_extra() {
        return dano_extra;
    }

    public void setDano_extra(int dano_extra) {
        this.dano_extra = dano_extra;
    }

    public int getReduccion_dano() {
        return reduccion_dano;
    }

    public void setReduccion_dano(int dano) {
        int reduccion_dano = dano/100*15;
        this.reduccion_dano = reduccion_dano;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
