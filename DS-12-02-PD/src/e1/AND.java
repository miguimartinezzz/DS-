package e1;

import java.util.ArrayList;
import java.util.Objects;

public class AND {
    ArrayList<Billete> billetes;
    ArrayList<Billete> flista;
    ArrayList<Billete> filtrada = new ArrayList<>();
    public AND(ArrayList<Billete> billetes,ArrayList<Billete> flista){
        this.billetes=billetes;
        this.flista=flista;
    }
    public ArrayList<Billete> and(/*ArrayList<Billete> billetes, ArrayList<Billete> flista*/){
        for (Billete billete : billetes) {
            for (Billete value : flista) {
                if (Objects.equals(billete, value)) {
                    if (!filtrada.contains(billete)) {
                        System.out.println(value);
                        filtrada.add(value);
                    }
                }
            }
        }
        if (filtrada.isEmpty())
            System.out.println("Lo siento no encontramos resultados");
        return filtrada;
    }
}

