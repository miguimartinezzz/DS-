package e1;

public abstract class Residentes extends Persona{

    // private String categoria;
        public enum Casas {
            Gryffindor,
            Hufflepuff,
            Ravenclaw,
            Slytherin
        }
        public Casas casa;

    public Residentes(String nombre,String apellido,int edad,int horrocruxes) {
            super(nombre,apellido,edad,horrocruxes);
          //  this.casa=casaz;

            }
   public abstract String tipo();
        }


