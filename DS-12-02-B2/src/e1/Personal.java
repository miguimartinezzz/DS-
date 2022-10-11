package e1;
public abstract class Personal extends Persona {
    public enum tipo {
        Guardabosques,
        Conserje,
        Docente
    }
    tipo type;
    Docente docente;
    public Personal (String nombre,String apellido,int edad,int horrocruxes) {
        super(nombre,apellido,edad,horrocruxes);
    }
    public abstract int Salario();
    /*public String profesion(){
        if (tipo.Docente == type)
            return type+ "de" +docente.profesion();
        else
            return String.valueOf(type);
    }*/
     public abstract String profesion();
    public abstract boolean es();
    }


   /* public Personal(String nombre, e1.Residentes.tipo type,){}
        if(type == e1.Residentes.tipo.Estudiante){
            this.tipos = e1.Residentes.tipo.Estudiante;
            this.setRecompensa(e1.Residentes.tipo.Estudiante.getValor());
            if(casaz == casas.Slytherin){this.setRecompensa(this.getRecompensa()*2);}}
        else{
            this.tipos = e1.Residentes.tipo.Fantasma;
            this.setRecompensa(e1.Residentes.tipo.Fantasma.getValor());
            if(Casa == casas.Slytherin){this.setRecompensa(this.getRecompensa()*2);}}
    }
}

*/

