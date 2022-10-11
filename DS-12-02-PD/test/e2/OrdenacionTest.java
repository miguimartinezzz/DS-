package e2;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class OrdenacionTest {
    @Test
    void ordenar(){
        ArrayList<String> padres = new ArrayList<>();
        ArrayList<String>  hijos = new ArrayList<>();
        ArrayList<String> tareas = new ArrayList<>();
        padres.add("C");hijos.add("A");
        padres.add("C");hijos.add("F");
        padres.add("A");hijos.add("B");
        padres.add("A");hijos.add("D");
        padres.add("B");hijos.add("E");
        padres.add("D");hijos.add("E");
        padres.add("F");hijos.add("E");
        padres.add("G");hijos.add("F");
        padres.add("G");hijos.add("H");
        padres.add("F");hijos.add("J");
        padres.add("H");hijos.add("J");
        ArrayList<String> expectedP = new ArrayList<>();
        expectedP.add("C");
        expectedP.add("G");
        expectedP.add("A");
        expectedP.add("F");
        expectedP.add("H");
        expectedP.add("B");
        expectedP.add("D");
        expectedP.add("E");
        expectedP.add("J");
        ArrayList<String> expectedF = new ArrayList<>();
        expectedF.add("C");
        expectedF.add("A");
        expectedF.add("B");
        expectedF.add("D");
        expectedF.add("G");
        expectedF.add("F");
        expectedF.add("E");
        expectedF.add("H");
        expectedF.add("J");
        ArrayList<String> expectedD = new ArrayList<>();
        expectedD.add("C");
        expectedD.add("A");
        expectedD.add("B");
        expectedD.add("D");
        expectedD.add("E");
        expectedD.add("F");
        expectedD.add("G");
        expectedD.add("H");
        expectedD.add("J");
        Vector v= new Vector(padres,hijos);
        Prioridad p = new Prioridad();
        Fuerte f = new Fuerte();
        Debil d = new Debil();
        v.setUpSortType(f);
        assertEquals(expectedF,v.Ordena());

    }

}