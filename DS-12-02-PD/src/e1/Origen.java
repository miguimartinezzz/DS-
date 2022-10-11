package e1;

import java.util.ArrayList;

public class Origen extends Criterios{
    ArrayList<Billete> lorigen = new ArrayList<>();
    String origen;
    public Origen(ArrayList<Billete> billetes ,String origen) {
        super(billetes);
        this.origen=origen;
    }
    @Override
    public ArrayList<Billete> Buscar(){
        for (Billete billete : billetes) {
            if (origen.compareTo(billete.getOrigen()) == 0) {
                if(!lorigen.contains(billete)) {
                    System.out.println(billete);
                    lorigen.add(billete);
                }
            }
        }
        return lorigen;
    }
}
