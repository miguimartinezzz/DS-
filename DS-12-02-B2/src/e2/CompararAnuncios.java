package e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CompararAnuncios {
    //public int comparator;
    ArrayList<Piso> Pisos;
    Comparator<Piso> comparator;

    public CompararAnuncios(){
        Pisos=new ArrayList<>();
        comparator=null;
    }

    public void setUpSortType(Comparator<Piso> a){
        this.comparator=a;
    }
    public void ordenation(){
        if(comparator==null){
            Collections.sort(Pisos);
        }
        else
            Collections.sort(Pisos,comparator);

    }
    public void printList(){
        for (Piso piso : Pisos) {System.out.println(piso.toString());}

    }

    public void addPiso(Piso p2) {
        Pisos.add(p2);
    }
}