// @author Rafael Figueredo Guimaraes

package br.edu.ifpb;

public class Main {

    public static void main(String[] args) {

        // creating the subject;
        Group group = new Group();

        // creating observers
        User user1 = new User("Rafael");
        User user2 = new User("Olivia");
        User user3 = new User("Pedro");

        // add observers;
        group.insertUserAtGroup(user1);
        group.insertUserAtGroup(user2);
        group.insertUserAtGroup(user3);


        // Seting states, each menssage is a new state here.
        group.newMenssage(new Menssage(user1, "Fala Galera!!"));
        group.newMenssage(new Menssage(user2, "Olá Rafael, tudo bem?"));


        // remove observers
        group.removeUserFromGroup(user3);


        // Seting a new menssage here.
        group.newMenssage(new Menssage(user2, "Por que Pedro saiu?"));



    }
}
