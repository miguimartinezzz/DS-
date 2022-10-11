package e1;

import java.util.ArrayList;

public class OR /*extends Criterios*/{
    ArrayList<Billete> billetes;
    ArrayList<Billete> flista;
    ArrayList<Billete> filtrada = new ArrayList<>();
    public OR(ArrayList<Billete> billetes,ArrayList<Billete> flista){
        this.billetes=billetes;
        this.flista=flista;
    }
    public ArrayList<Billete> or(/*ArrayList<Billete> lista1, ArrayList<Billete> lista2*/){
        // System.out.println(value);
        for (Billete value : billetes) {
            if (!filtrada.contains(value))
                filtrada.add(value);
        }

        for (Billete billete : flista) {
            if (!filtrada.contains(billete))
                filtrada.add(billete);
            }
            if (filtrada.isEmpty())
                System.out.println("Lo siento no encontramos resultados");
            return filtrada;
        }
}
