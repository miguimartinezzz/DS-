package e1;

import java.util.ArrayList;

public class Fecha extends Criterios {
    ArrayList<Billete> lfecha = new ArrayList<>();
    String fecha;
    public Fecha(ArrayList<Billete> billetes ,String fecha){
        super(billetes);
        this.fecha=fecha;
    }
    @Override
    public ArrayList<Billete> Buscar(){
        for (Billete billete : billetes) {
            if (fecha.compareTo(billete.getFecha()) == 0)
                if(!lfecha.contains(billete))
                lfecha.add(billete);

        }
        return lfecha;
    }
}
