package e2;
import java.util.Comparator;

class PrecioBase implements Comparator<Piso>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Piso a, Piso b)
    {
        return (int) (a.precioBase - b.precioBase);
    }
}