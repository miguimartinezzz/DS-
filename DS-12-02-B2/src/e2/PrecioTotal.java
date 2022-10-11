package e2;
import java.util.Comparator;

class PrecioTotal implements Comparator<Piso>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Piso a, Piso b)
    {
        return (int) (a.PrecioTotal(a.precioPlaza,a.precioBase) - b.PrecioTotal(b.precioPlaza,b.precioBase));
    }
}