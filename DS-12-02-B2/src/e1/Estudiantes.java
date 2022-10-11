package e1;

public class Estudiantes extends Residentes{
    int galeon1=90;
    Residentes.Casas casa;
    Persona persona;
    public Estudiantes(Casas casa,String nombre,String apellido,int edad,int horrocruxes ) {
        super(nombre,apellido,edad,horrocruxes);
        this.casa= casa;
    }
    public String tipo(){
        return "Estudiante de "+casa.toString();
    }
    @Override
    public float Recompensa() {
        if(casa==Residentes.Casas.Slytherin)
        return 2*(horrocruxes*galeon1);
        else return horrocruxes*galeon1 ;
    }

}

