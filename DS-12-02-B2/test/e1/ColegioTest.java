package e1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColegioTest {
    private final Colegio colegio = new Colegio();


     /*   @BeforeEach
        void setUp() {

        }*/

@Test
void TestHogwarts(){
        Residentes r1 = new Estudiantes( Residentes.Casas.Gryffindor,"Hermion","Granger",15,3);
        Residentes r2 = new Fantasmas(Residentes.Casas.Slytherin,"Barón","Sanguinario",1,1);
        Personal p1= new Guardabosques("Rubeus","Hagrid",45,2);
        Personal p2 = new Docente(Docente.asignaturas.Transformaciones,"Minerva","McGonagall",55,1);
        Personal p3 = new Docente(Docente.asignaturas.Defensa,"Severus","Snape",38,2);
        Personal p4 = new Conserjes("Argus","Filch",60,0);
        /*intentar meter a mas de un docente en una misma asignatura(daría error)*/
        colegio.addResidente(r1);
        colegio.addResidente(r2);
        colegio.addPersonal(p1);
        colegio.addPersonal(p2);
        colegio.addPersonal(p3);
        colegio.addPersonal(p4);
        assertEquals(705.0,colegio.imprimirRecompensas());
        //assertEquals(1240,colegio.imprimirSalarios());
         Personal p5 = new Docente(Docente.asignaturas.Defensa,"Poppy","Pomfrey",60,4);
        assertThrows(IllegalArgumentException.class,() -> colegio.addPersonal(p5));
    }
}