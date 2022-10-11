package e3;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Network{
    NetworkManager tipo;
    public Network(){
        tipo = null;
    }
    public void setUpSortType(NetworkManager a){
        this.tipo=a;
    }


    public void add(String user, List<TopicOfInterest> topicOfInterests){
        tipo.addUser(user,topicOfInterests);
    }
    public void remove(String user){
        tipo.removeUser(user);
    }
    public void modificar(String user,TopicOfInterest topicOfInterest,boolean add){
        if(add)
        tipo.addInterest(user,topicOfInterest);
        else
        tipo.removeInterest(user,topicOfInterest);
    }
    public String ensenar(String user){
      return tipo.getInterestsUser(user).toString();
    }
    public String buscarT(String user1,String user2){
        List<TopicOfInterest> topic = new ArrayList<>();
        boolean deporte1=false,deporte2=false,informatica1=false,informatica2=false,
                cocina1=false,cocina2=false,musica1=false,musica2=false,lectura1=false,lectura2=false;
        if(tipo.getInterestsUser(user1).contains(TopicOfInterest.Deporte)){
            deporte1=true;
        }
        if(tipo.getInterestsUser(user2).contains(TopicOfInterest.Deporte)){
            deporte2=true;
        }
        if(tipo.getInterestsUser(user1).contains(TopicOfInterest.Informatica)){
            informatica1=true;
        }
        if(tipo.getInterestsUser(user2).contains(TopicOfInterest.Informatica)){
            informatica2=true;
        }
        if(tipo.getInterestsUser(user1).contains(TopicOfInterest.Cocina)){
            cocina1=true;
        }
        if(tipo.getInterestsUser(user2).contains(TopicOfInterest.Cocina)){
            cocina2=true;
        }
        if(tipo.getInterestsUser(user1).contains(TopicOfInterest.Musica)){
            musica1=true;
        }
        if(tipo.getInterestsUser(user2).contains(TopicOfInterest.Musica)){
            musica2=true;
        }
        if(tipo.getInterestsUser(user1).contains(TopicOfInterest.Lectura)){
            lectura1=true;
        }
        if(tipo.getInterestsUser(user2).contains(TopicOfInterest.Lectura)){
            lectura2=true;
        }
        if (deporte1 && deporte2)
            topic.add(TopicOfInterest.Deporte);
        if (informatica1 && informatica2)
            topic.add(TopicOfInterest.Informatica);
        if (cocina1 && cocina2)
            topic.add(TopicOfInterest.Cocina);
        if (lectura1 && lectura2)
            topic.add(TopicOfInterest.Lectura);
        if (musica1 && musica2)
            topic.add(TopicOfInterest.Musica);

        return topic.toString();
    }
    public String bucarU(TopicOfInterest topic){
        List<String> user= new ArrayList<>();
        for (int i = 0;i<tipo.getUsers().size();i++) {

            if (tipo.getInterestsUser(tipo.getUsers().get(i)).contains(topic))
                user.add(tipo.getUsers().get(i));
        }
       return user.toString();
    }
    public String lista(){
       return tipo.getInterests().toString();}

    public void allinfo(){
        for (int i = 0;i<tipo.getUsers().size();i++) {
            System.out.println(tipo.getUsers().get(i));
            System.out.println(tipo.getInterestsUser(tipo.getUsers().get(i)));
        }
    }
}
