package e3;

import java.util.*;

class Mapear implements NetworkManager {
    Map<String,List<TopicOfInterest>> usuario;

    public Mapear() {
        usuario = new LinkedHashMap<>();
    }

    public void addUser(String user, List<TopicOfInterest> topicsOfInterest) {
            usuario.putIfAbsent(user, topicsOfInterest);
    }

    public void removeUser(String user) {
                usuario.remove(user);
    }

    public void addInterest(String user, TopicOfInterest topicOfInterest) {
        List<TopicOfInterest> topic;
        for (int i=0; i<getUsers().size();i++){
            if (Objects.equals(getUsers().get(i), user)) {
                if (!usuario.get(user).contains(topicOfInterest)) {
                    topic = usuario.get(user);
                    topic.add(topicOfInterest);
                    usuario.replace(user, usuario.get(user), topic);
                }
            }
        }
    }

    public void removeInterest(String user, TopicOfInterest topicOfInterest) {
        List<TopicOfInterest> topic;
        for (int i = 0; i < getUsers().size(); i++) {
            if (Objects.equals(getUsers().get(i), user)) {
                topic = usuario.get(user);
                topic.remove(topicOfInterest);
                usuario.replace(user, usuario.get(user), topic);
            }
        }
    }

    public List<String> getUsers() {
        return new ArrayList<>(usuario.keySet());
    }

    public List<TopicOfInterest> getInterests() {
        Set<TopicOfInterest> intereses = new HashSet<>();

        for (String key : usuario.keySet()) {
            intereses.addAll(usuario.get(key));
        }
        return new ArrayList<>(intereses);
    }

    public List<TopicOfInterest> getInterestsUser(String user) {
        return usuario.get(user);
    }
}