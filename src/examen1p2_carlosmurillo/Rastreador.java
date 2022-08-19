package examen1p2_carlosmurillo;

public class Rastreador extends Personaje{
    private int dano_extra = super.getArma().getDaño()/100*10;
    private int aumento_presicion = super.getArma().getPresicion()/100*10;

    public Rastreador() {
    }

    public Rastreador(String nombre, int vida, int escudo, Arma arma) {
        super(nombre, vida, escudo, arma);
    }

    public int getDano_extra() {
        return dano_extra;
    }

    public void setDano_extra(int dano_extra) {
        this.dano_extra = dano_extra;
    }

    public int getAumento_presicion() {
        return aumento_presicion;
    }

    public void setAumento_presicion(int aumento_presicion) {
        this.aumento_presicion = aumento_presicion;
    }
    
    

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
