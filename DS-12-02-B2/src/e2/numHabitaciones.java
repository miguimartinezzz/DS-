package e2;
import java.util.Comparator;

class numHabitaciones implements Comparator<Piso>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Piso a, Piso b)
    {
        return a.numHabitaciones - b.numHabitaciones;
    }
}

