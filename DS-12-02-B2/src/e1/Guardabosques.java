package e1;

public class Guardabosques extends Personal {
    int galeon1= 75;
    public Guardabosques(String nombre,String apellido,int edad,int horrocruxes){
        super(nombre,apellido,edad,horrocruxes);
    }
    @Override
    public int Salario() {
        return 180;
    }
    @Override
    public float Recompensa() {
        return horrocruxes*galeon1 ;
    }
    public String profesion(){
        return "Guardabosques";
    }
    public boolean es(){
        return false;
    }
}
