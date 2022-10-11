package e1;

import java.util.ArrayList;

public abstract class Criterios {
    ArrayList<Billete> billetes ;
    public Criterios(ArrayList<Billete> billetes){
        this.billetes=billetes;
    }
    public abstract ArrayList<Billete> Buscar();
}
