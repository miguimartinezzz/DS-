package e2;
import java.util.Objects;

public class Piso extends Anuncio implements Comparable<Piso>{
    public int codigoPostal;
    public float tamaño;
    public int numBaños;
    public int numHabitaciones;
    public int numPlazas;
    public float precioBase;
    public float precioPlaza;


    public Piso(int numRef,float precioBase,float precioPlaza,int codigoPostal, float tamaño, int numBaños, int numHabitaciones, int numPlazas) {
        super(numRef);
        this.codigoPostal = codigoPostal;
        this.tamaño = tamaño;
        this.numBaños = numBaños;
        this.numHabitaciones = numHabitaciones;
        this.numPlazas = numPlazas;
        this.precioBase=precioBase;
        this.precioPlaza=precioPlaza;
    }
    public float PrecioTotal ( float precioPlaza, float precioBase){
        return precioBase + (numPlazas * precioPlaza);
    }
    @Override
    public int compareTo(Piso p) {
        if(numRef==p.numRef)
            return 0;
        else if (numRef>p.numRef)
            return 1;
        else
            return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piso piso = (Piso) o;
        return codigoPostal == piso.codigoPostal && Float.compare(piso.tamaño, tamaño) == 0 && numBaños == piso.numBaños && numHabitaciones == piso.numHabitaciones && numPlazas == piso.numPlazas && Float.compare(piso.precioBase, precioBase) == 0 && Float.compare(piso.precioPlaza, precioPlaza) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoPostal, tamaño, numBaños, numHabitaciones, numPlazas, precioBase, precioPlaza);
    }
    @Override
    public String toString() {
        return "NumRef: "+numRef+" "+"Precio Base: "+precioBase+"  "+"Precio Plaza: "+precioPlaza+"  "+"Codigo Postal: "+codigoPostal+"  "+"Tamaño"+tamaño+"  "+"Num Baños: "+numBaños+"  "+"Num Habitaciones: "+numHabitaciones+"  "+"Num Plazas: "+numPlazas;
    }
}