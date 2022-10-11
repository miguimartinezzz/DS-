package e3;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class NetworkTest {
    @Test
    void testUsuariosTabla(){
        Network user = new Network();
        NetworkManager tabla = new Tablas(5);
        List<TopicOfInterest> topicJuan = new ArrayList<>();
        List<TopicOfInterest> topicMarcos = new ArrayList<>();
        topicJuan.add(TopicOfInterest.Informatica);
        topicJuan.add(TopicOfInterest.Cocina);
        topicJuan.add(TopicOfInterest.Deporte);
        topicMarcos.add(TopicOfInterest.Cocina);
        topicMarcos.add(TopicOfInterest.Lectura);
        topicMarcos.add(TopicOfInterest.Deporte);
        user.setUpSortType(tabla);
        user.add("Juan", topicJuan);
        user.add("Marcos", topicMarcos);
        assertEquals("[Deporte, Informatica, Cocina, Lectura]",user.lista());
        user.modificar("Juan",TopicOfInterest.Informatica,false);
        assertEquals("[Deporte, Cocina]",user.ensenar("Juan"));
        user.modificar("Juan",TopicOfInterest.Informatica,true);
        assertEquals("[Deporte, Informatica, Cocina]",user.ensenar("Juan"));
        assertEquals("[Deporte, Cocina]",user.buscarT("Juan","Marcos"));
        assertEquals("[Juan, Marcos]",user.bucarU(TopicOfInterest.Deporte));
        user.allinfo();
        user.remove("Marcos");
        user.allinfo();
    }
      @Test
    void testUsuariosMapa(){
        Network user = new Network();
        NetworkManager mapa = new Mapear();
        List<TopicOfInterest> topicJuan = new ArrayList<>();
        List<TopicOfInterest> topicMarcos = new ArrayList<>();
        topicJuan.add(TopicOfInterest.Deporte);
        topicJuan.add(TopicOfInterest.Informatica);
        topicJuan.add(TopicOfInterest.Cocina);
        topicMarcos.add(TopicOfInterest.Deporte);
        topicMarcos.add(TopicOfInterest.Cocina);
        topicMarcos.add(TopicOfInterest.Lectura);
        user.setUpSortType(mapa);
        user.add("Juan", topicJuan);
        user.add("Marcos", topicMarcos);
        assertEquals("[Cocina, Deporte, Lectura, Informatica]",user.lista());
        user.modificar("Juan",TopicOfInterest.Informatica,false);
        assertEquals("[Deporte, Cocina]",user.ensenar("Juan"));
        user.modificar("Juan",TopicOfInterest.Informatica,true);
        assertEquals("[Deporte, Cocina, Informatica]",user.ensenar("Juan"));
        assertEquals("[Deporte, Cocina]",user.buscarT("Juan","Marcos"));
        assertEquals("[Juan, Marcos]",user.bucarU(TopicOfInterest.Deporte));
        user.allinfo();
        user.remove("Marcos");
        user.allinfo();
    }
}