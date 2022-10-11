package e1;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class BuscarTest {
    @Test
    void origenyprecio(){
        ArrayList<Billete>billetes = new ArrayList<>();
        ArrayList<Billete>billetesaux = new ArrayList<>();
        ArrayList<Billete>billetesaux1 = new ArrayList<>();
        Billete billete1 = new Billete("Coruña","Vigo",15,"1/4/2020");
        Billete billete2 = new Billete("Coruña","Orense",15,"2/4/2020");
        Billete billete3 = new Billete("Vigo","Orense",6,"2/4/2020");
        billetes.add(billete1);
        billetes.add(billete2);
        billetes.add(billete3);
        billetesaux1.add(billete1);
       /*billetesaux1.add(billete2);
        billetesaux1.add(billete3);*/
        Origen origen1 = new Origen(billetes,"Coruña");
        Origen origen2 = new Origen(billetes,"Vigo");
        OR or1=new OR(origen1.Buscar(),origen2.Buscar());
        Precio precio1= new Precio(billetes,15);
        AND and1= new AND(or1.or(),precio1.Buscar());
        Destino destino1= new Destino(billetes,"Vigo");
        AND and2=new AND(and1.and(),destino1.Buscar());
        Fecha fecha1=new Fecha(billetes,"1/4/2020");
        AND and3=new AND(and2.and(),fecha1.Buscar());
        assertEquals(billetesaux1,and3.and());

        //assertEquals(billetesaux1,or1.or());
        //Fecha fecha1

    }

}