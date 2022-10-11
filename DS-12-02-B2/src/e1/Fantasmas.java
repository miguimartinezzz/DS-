package e1;

public class Fantasmas extends Residentes {
    int galeon1=80;
    Residentes.Casas casa;
    public Fantasmas(Casas casa,String nombre,String apellido,int edad,int horrocruxes ) {
        super(nombre,apellido,edad,horrocruxes);
        this.casa=casa;
    }
    public String tipo(){
        return "Fantasma de "+casa.toString();
    }
    @Override
    public float Recompensa() {
        if(casa==Residentes.Casas.Slytherin)
            return 2*(horrocruxes*galeon1);
        else return horrocruxes*galeon1 ;
    }

}
