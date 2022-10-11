package e1;


import java.util.ArrayList;
import java.util.Objects;

public class Colegio {
    ArrayList<Residentes> residentes;
    ArrayList<Personal> personal;
    int defensa=0,transformaciones=0,pociones=0,herbologia=0,historia=0;
   // ArrayList<Persona> personas;

    public Colegio() {
        residentes = new ArrayList<Residentes>();
        personal= new ArrayList<Personal>();
    }

    public void addResidente(Residentes residentez) { residentes.add(residentez); }

    public void addPersonal(Personal personalz) {
        if (personalz.es()) {
            if ((Objects.equals(personalz.profesion(), "Docente de Defensa")) && defensa == 0) {
                defensa++;
                personal.add(personalz);
            }
            else if ((Objects.equals(personalz.profesion(), "Docente de Transformaciones")) && transformaciones==0) {
                transformaciones++;
                personal.add(personalz);
            }
            else if ((Objects.equals(personalz.profesion(), "Docente de Pociones")) && pociones==0) {
                pociones++;
                personal.add(personalz);
            }
            else if ((Objects.equals(personalz.profesion(), "Docente de Herbología"))&& herbologia==0) {
                herbologia++;
                personal.add(personalz);
            }
            else if ((Objects.equals(personalz.profesion(), "Docente de Historia")) && historia==0) {
                historia++;
                personal.add(personalz);
            }
        else
            throw new IllegalArgumentException();
        }
        else
              personal.add(personalz);
        }


   public float imprimirRecompensas(){
        float galeones=0f;
        for (Residentes residente : residentes) {
            System.out.println("" + residente.nombreCompleto() + "("+residente.tipo() +" "+residente.horrocruxes+" horrocruxes):" +residente.Recompensa()+" galeones");
            galeones += residente.Recompensa();
        }
        for (Personal value : personal) {
            System.out.println("" + value.nombreCompleto() + "(" + value.profesion() + "," + value.horrocruxes + " horrocruxes):" + value.Recompensa() + " galeones");
            galeones += value.Recompensa();
        }
        System.out.println("La recompensa total del Colegio Hogwarts es de "+galeones+" galeones");
        return galeones;
    }
    public int imprimirSalarios() {
        int galeones = 0;
        for (Personal value : personal) {
            System.out.println("" + value.nombreCompleto() + "(" + value.profesion() + "): " + value.Salario() + " galeones");
            galeones += value.Salario();
        }
        System.out.println("El gasto de Hogwarts en personal es de " +galeones+ " galeones");
        return galeones;
    }
}
