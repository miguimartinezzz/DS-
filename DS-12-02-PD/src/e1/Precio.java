package e1;

import java.util.ArrayList;

public class Precio extends Criterios {
    ArrayList<Billete> lprecio = new ArrayList<>();
    float precio;
    public Precio(ArrayList<Billete> billetes ,float precio) {
        super(billetes);
        this.precio=precio;
    }
    @Override
    public ArrayList<Billete> Buscar(){
        for (Billete billete : billetes) {
                if (precio >= billete.getPrecio())
                    if(!lprecio.contains(billete))
                    lprecio.add(billete);
            }
        return lprecio;
    }
}
