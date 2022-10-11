package e2;


import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class CompararAnunciosTest {
    public CompararAnuncios comparar = new CompararAnuncios();
    ArrayList<Piso> prueba =new ArrayList<>();
    Piso p1 = new Piso(101, 950.65f, 32.3f, 15007, 900f, 4, 5, 2);
    Piso p2 = new Piso(121, 950.65f, 32.3f, 15007, 900f, 4, 5, 2);
    Piso p3 = new Piso(134, 1550.43f, 54.3f, 36600, 1400.5f, 6, 4, 2);
    Piso p4 = new Piso(101, 1950.65f, 76.3f, 15007, 1440f, 4, 3, 2);
    @Test
    void TestEquals(){
        assertEquals(p1,p2); //DISTINTO NUMREF,MISMO PISO
        assertNotEquals(p1,p3); //DISTINTO PISO
        assertNotEquals(p2,p3);
        assertNotEquals(p1,p4);//MISMO NUMREF,DISTINTO PISO
    }
    @Test
    void TesthashCode(){
        assertEquals(p1.hashCode(),p2.hashCode()); //DISTINTO NUMREF,MISMO PISO
        assertNotEquals(p1.hashCode(),p3.hashCode()); //DISTINTO PISO
        assertNotEquals(p2.hashCode(),p3.hashCode());
        assertNotEquals(p1.hashCode(),p4.hashCode());//MISMO NUMREF,DISTINTO PISO
    }
    @Test
    void TestOrdenacion() {
        comparar.addPiso(p1);
        comparar.addPiso(p2);
        comparar.addPiso(p3);
        comparar.addPiso(p4);
        //PROBAR ORDENACION NATURAL
        prueba.add(p1);
        prueba.add(p4);
        prueba.add(p2);
        prueba.add(p3);
        comparar.ordenation();
        assertEquals(prueba,comparar.Pisos);
        System.out.println("Ordenacion Natural\n");
        comparar.printList();
        System.out.println("\n");
        prueba.clear();
        //PROBAR ORDENACION PRECIOBASE
        prueba.add(p1);
        prueba.add(p2);
        prueba.add(p3);
        prueba.add(p4);
        PrecioBase pb = new PrecioBase();
        comparar.setUpSortType(pb);
        comparar.ordenation();
        assertEquals(prueba,comparar.Pisos);
        System.out.println("Ordenacion por precio base\n");
        comparar.printList();
        System.out.println("\n");
        prueba.clear();
        //PROBAR ORDENACION NUMBAÑOS
        prueba.add(p1);
        prueba.add(p2);
        prueba.add(p4);
        prueba.add(p3);
        numBaños num = new numBaños();
        comparar.setUpSortType(num);
        comparar.ordenation();
        assertEquals(prueba,comparar.Pisos);
        System.out.println("Ordenacion por número de baños\n");
        comparar.printList();
        System.out.println("\n");
        prueba.clear();
        //PROBAR ORDENACION NUMHABITACIONES
        prueba.add(p4);
        prueba.add(p3);
        prueba.add(p1);
        prueba.add(p2);
        numHabitaciones num1 = new numHabitaciones();
        comparar.setUpSortType(num1);
        comparar.ordenation();
        assertEquals(prueba,comparar.Pisos);
        System.out.println("Ordenacion por número de habitaciones\n");
        comparar.printList();
        System.out.println("\n");
        prueba.clear();
        //PROBAR ORDENACION PRECIOTOTAL
        prueba.add(p2);
        prueba.add(p1);
        prueba.add(p3);
        prueba.add(p4);
        PrecioTotal price = new PrecioTotal();
        comparar.setUpSortType(price);
        comparar.ordenation();
        assertEquals(prueba,comparar.Pisos);
        System.out.println("Ordenacion por precio total\n");
        comparar.printList();
        System.out.println("\n");

    }
}