package e2;

import java.util.ArrayList;
import java.util.Collections;

public class Debil implements Ordenacion {


    @Override
    public ArrayList<String> ordenar(ArrayList<String> padres,ArrayList<String> hijos){
        ArrayList<String> tareas = new ArrayList<>();
        ArrayList<String> orden = new ArrayList<>();
        String auxdelete;
        boolean esta,borrar=false;
        int m=0;
        for (String padre : padres) {
            esta = false;
            for (String hijo : hijos) {
                if (padre.equals(hijo)) {
                    esta = true;
                    break;
                }
            }
            if (!esta) {
                if (!tareas.contains(padre))
                    tareas.add(padre);
            }
        }

        while (!tareas.isEmpty()) {
            Collections.sort(tareas);
         //   System.out.println("tareas:"+tareas);
            if (!orden.contains(tareas.get(m))) {
           //       System.out.println(tareas.get(m));
                for (int i = 0; i < padres.size(); i++) {
                    if (borrar){
                        i=0;
                        borrar=false;
                    }
                    if (padres.get(i).equals(tareas.get(m))) {
                        auxdelete = hijos.get(i);
                    //    System.out.println("padres:"+padres);
                        if (!tareas.contains(auxdelete) && !orden.contains(auxdelete))
                            tareas.add(auxdelete);
                        hijos.remove(auxdelete);
                        padres.remove(tareas.get(m));
                        borrar=true;
                    }
                }

                orden.add(tareas.get(m));
                tareas.remove(tareas.get(m));
                m=0;
            }
            else
                m++;
         //     System.out.println("Lista:"+orden);
        }
        return orden;
    }
}
