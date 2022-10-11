package e1;

public class Conserjes extends Personal {
    int galeon1 = 65;

    public Conserjes(String nombre, String apellido, int edad, int horrocruxes) {
        super(nombre, apellido, edad, horrocruxes);
    }

    @Override
    public int Salario() {
        return 160;
    }

    @Override
    public float Recompensa() {
        return horrocruxes * galeon1;
    }
    public String profesion(){
        return "Conserje";
    }
    public boolean es(){
        return false;
    }
}
