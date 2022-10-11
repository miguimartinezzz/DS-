package e2;

import java.util.*;

public class Vector {
    private Ordenacion tipo;
    public ArrayList<String> padres= new ArrayList<String>();
    public ArrayList<String> hijos= new ArrayList<String>();
    public Vector(ArrayList<String> padres, ArrayList<String> hijos){
        this.padres=padres;
        this.hijos=hijos;
    }
    public Ordenacion getAlgoritmo(){
        return tipo;
    }
    public void setUpSortType(Ordenacion a){
        this.tipo=a;
    }
    public ArrayList Ordena(){
        return tipo.ordenar(padres,hijos);
    }
}
