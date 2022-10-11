package e1;

public class Docente extends Personal {
    public int galeon1=50;
    public enum asignaturas {
        Defensa,
        Pociones,
        Herbología,
        Historia,
        Transformaciones
    }

    asignaturas asignatura;
    public Docente(asignaturas asignatura,String nombre,String apellido,int edad,int horrocruxes){
        super(nombre,apellido,edad,horrocruxes);
        this.asignatura=asignatura;
    }
    @Override
    public float Recompensa() {
        if (asignatura == asignaturas.Defensa) {

            return (float) (0.75*(horrocruxes * galeon1));
        }
        else
            return horrocruxes*galeon1 ;
    }
    public String profesion(){
        return "Docente de "+asignatura.toString();
    }

    public int Salario() {
        switch (asignatura) {
            case Defensa:
                return 500;
            case Transformaciones:
                return 400;
            case Pociones:
                return 350;
            case Herbología:
                return 250;
            case Historia:
                return 200;
            default:
        }
        return 0;
    }
    public boolean es(){
        return true;
    }
}