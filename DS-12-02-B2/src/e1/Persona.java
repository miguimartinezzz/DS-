package e1;

public abstract class Persona {
   public String nombre;
   public String apellido;
   public int edad;
   public int horrocruxes;
   public Persona(String nombre,String apellido,int edad,int horrocruxes){
       this.nombre=nombre;
       this.apellido=apellido;
       this.edad=edad;
       this.horrocruxes=horrocruxes;
   }

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    public abstract float Recompensa();
    }
