package e3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tablas implements NetworkManager {
    int[][] matriz;
    ArrayList<String> usuarios;

    public Tablas(int x) {//la x es el numero de usuarios que quieres intrducir
        usuarios = new ArrayList<>();
        matriz = new int[5][x];
    }

    public void addUser(String user, List<TopicOfInterest> topicsOfInterest) {
        boolean existe=false;
        for (String usuario : usuarios) {
            if (usuario.contains(user))
                existe = true;
        }
        if (!existe) {
            usuarios.add(user);
            int i = usuarios.size()-1;
            for (TopicOfInterest topicOfInterest : topicsOfInterest) {
                escribirM(topicOfInterest, i);
            }
        }
        else  throw new IllegalArgumentException();
    }


    public void removeUser(String user) {
    for (int i=0;i<usuarios.size();i++){
        if (usuarios.get(i).contains(user)) {
            usuarios.remove(user);
            matriz[0][i]=0;
            matriz[1][i]=0;
            matriz[2][i]=0;
            matriz[3][i]=0;
            matriz[4][i]=0;
            //Se quitaria sus gustos de la lista de intereses ya que a otro tambien le podría gustar
        }

        }

    }

    public void addInterest(String user, TopicOfInterest topicOfInterest) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (Objects.equals(usuarios.get(i), user)) {
                escribirM(topicOfInterest, i);
            }
        }
    }

    public void removeInterest(String user, TopicOfInterest topicOfInterest) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (Objects.equals(usuarios.get(i), user)) {
                if (topicOfInterest == TopicOfInterest.Deporte)
                    matriz[0][i] = 0;
                if (topicOfInterest == TopicOfInterest.Informatica)
                    matriz[1][i] = 0;
                if (topicOfInterest == TopicOfInterest.Cocina)
                    matriz[2][i] = 0;
                if (topicOfInterest == TopicOfInterest.Lectura)
                    matriz[3][i] = 0;
                if (topicOfInterest == TopicOfInterest.Musica)
                    matriz[4][i] = 0;
            }
        }
    }


    public List<String> getUsers() {
        return usuarios;
    }

    public List<TopicOfInterest> getInterests() {
        List<TopicOfInterest> topic = new ArrayList<>();
        int Deporte=0,Informatica=0,Cocina=0,Lectura=0,Musica=0;//para que no se repitan
        for (int i = 0; i < 5; i++) {
                if (matriz[0][i] == 1 && Deporte==0) {
                    topic.add(TopicOfInterest.Deporte);
                    Deporte++;
                }
                if (matriz[1][i] == 1 && Informatica==0) {
                    topic.add(TopicOfInterest.Informatica);
                    Informatica++;
                }
                if (matriz[2][i] == 1 && Cocina==0) {
                    topic.add(TopicOfInterest.Cocina);
                    Cocina++;
                }
                if (matriz[3][i] == 1 && Lectura==0){
                    topic.add(TopicOfInterest.Lectura);
                    Lectura++;
                }
                if (matriz[4][i] == 1 && Musica==0) {
                    topic.add(TopicOfInterest.Musica);
                    Musica++;
                }
        }
        return topic;
    }

    public List<TopicOfInterest> getInterestsUser(String user) {
        List<TopicOfInterest> topic = new ArrayList<>();
        for (int i = 0; i < usuarios.size(); i++) {
            if (Objects.equals(usuarios.get(i), user)) {
                if (matriz[0][i] == 1) {
                    topic.add(TopicOfInterest.Deporte);
                }
                if (matriz[1][i] == 1) {
                    topic.add(TopicOfInterest.Informatica);
                }
                if (matriz[2][i] == 1) {
                    topic.add(TopicOfInterest.Cocina);
                }
                if (matriz[3][i] == 1) {
                    topic.add(TopicOfInterest.Lectura);
                }
                if (matriz[4][i] == 1) {
                    topic.add(TopicOfInterest.Musica);
                }

            }
        }
        return topic;
    }

    private void escribirM (TopicOfInterest topicOfInterest, int i) {
        if (topicOfInterest == TopicOfInterest.Deporte)
            matriz[0][i] = 1;
        if (topicOfInterest == TopicOfInterest.Informatica)
            matriz[1][i] = 1;
        if (topicOfInterest == TopicOfInterest.Cocina)
            matriz[2][i] = 1;
        if (topicOfInterest == TopicOfInterest.Lectura)
            matriz[3][i] = 1;
        if (topicOfInterest == TopicOfInterest.Musica)
            matriz[4][i] = 1;
    }
}