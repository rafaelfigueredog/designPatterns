// @author Rafael Figueredo Guimaraes

package br.edu.ifpb;
import java.util.HashMap;
import java.util.Set;

// Subject class;
public class Group {

    private HashMap<Integer, User> users; // Observers;
    private Integer id;

    public Group() {
        this.users = new HashMap<>();
        this.id = 0;
    }

    public void newMenssage(Menssage menssage) {
        notifyUsers(menssage);
    }

    public void notifyUsers(Menssage menssage) {
        User sender = this.users.get(menssage.getUser().getId());
        sender.update(menssage);
        Set<Integer> setOfids = users.keySet();
        for (Integer id: setOfids ) {
            if (!users.get(id).equals(sender)) users.get(id).update(menssage);
        }
        System.out.println("");
    }

    public void insertUserAtGroup(User user) {
        user.setId(id);
        this.users.put(id++, user);
        System.out.println();
        notifyUsers(user, "join!");
        System.out.println();
    }

    public void removeUserFromGroup(User user){
        System.out.println();
        notifyUsers(user, "left");
        System.out.println();
        this.users.remove(user.getId());

    }

    public void notifyUsers(User user, String menssage) {
        User sender = this.users.get(user.getId());
        sender.updateGroup(user, menssage);
        Set<Integer> setOfid = this.users.keySet();
        for (Integer id: setOfid) {
            if (!this.users.get(id).equals(user)) {
                if (!users.get(id).equals(sender)) users.get(id).updateGroup(user, menssage);
            }
        }
    }



    public HashMap<Integer, User> getUsers() {
        return users;
    }

    public void setUsers(HashMap<Integer, User> users) {
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
