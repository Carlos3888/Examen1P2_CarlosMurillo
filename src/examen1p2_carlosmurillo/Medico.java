package examen1p2_carlosmurillo;

public class Medico extends Personaje{
    private int curacion = 0;
    private int dano_extra = super.getArma().getDaño()/100*5;

    public Medico() {
    }

    public Medico( String nombre, int vida, int escudo, Arma arma) {
        super(nombre, vida, escudo, arma);        
    }

    public int getCuracion() {
        return curacion;
    }

    public void setCuracion(int vida, int random) {
        int curacion = vida/100*random;
        this.curacion = curacion;
    }

    public int getDano_extra() {
        return dano_extra;
    }

    public void setDano_extra(int dano_extra) {
        this.dano_extra = dano_extra;
    }
    

    @Override
    public String toString() {
        return super.toString();
    }
    
    public void curacion(int vida, int curacion){
        super.vida = vida + curacion;
    }
    
}
