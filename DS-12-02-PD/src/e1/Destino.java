package e1;

import java.util.ArrayList;

public class Destino extends Criterios{
    ArrayList<Billete> ldestino = new ArrayList<>();
    String destino;
    public Destino(ArrayList<Billete> billetes ,String destino) {
        super(billetes);
        this.destino=destino;
    }
    @Override
    public ArrayList<Billete> Buscar(){
        for (Billete billete : billetes) {
                if (destino.compareTo(billete.getDestino()) == 0)
                    if(!ldestino.contains(billete))
                    ldestino.add(billete);

        }
        return ldestino;
    }
}
