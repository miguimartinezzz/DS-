package e2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Apartamento {
    //public int comparator;
    ArrayList<Piso> Pisos;
    Comparator<Piso> comparator;
    public Apartamento(){
        Pisos=new ArrayList<>();
        comparator=null;
    }
    public void addPiso(Piso piso) {
        Pisos.add(piso);
    }
    public void setUpSortType(Comparator<Piso> a){
        this.comparator=a;
    }
    class PrecioBase implements Comparator<Piso>
    {
        // Used for sorting in ascending order of
        // roll number
        public int compare(Piso a, Piso b)
        {
            return (int) (a.precioBase - b.precioBase);
        }
    }
    class PrecioTotal implements Comparator<Piso>
    {
        // Used for sorting in ascending order of
        // roll number
        public int compare(Piso a, Piso b)
        {
            return (int) (a.PrecioTotal(a.precioPlaza,a.precioBase) - b.PrecioTotal(b.precioPlaza,b.precioBase));
        }
    }
    class NumBaños implements Comparator<Piso>
    {
        // Used for sorting in ascending order of
        // roll number
        public int compare(Piso a, Piso b)
        {
            return a.numBaños - b.numBaños;
        }
    }
    class NumHabitaciones implements Comparator<Piso>
    {
        // Used for sorting in ascending order of
        // roll number
        public int compare(Piso a, Piso b)
        {
            return a.numHabitaciones - b.numHabitaciones;
        }
    }
    public void ordenation(){
        if(comparator==null){
            Collections.sort(Pisos);
        }
        else
            Collections.sort(Pisos,comparator);

    }
}
