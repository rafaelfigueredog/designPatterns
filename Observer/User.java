// @author Rafael Figueredo Guimarães

package br.edu.ifpb;

public class User extends UserObserver {

    private String name;
    private Integer id;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void update(Menssage menssage) {
        if ( menssage.getUser().equals(this) ) {
            System.out.println(menssage.getUser().getName() + "\t[You sended]:\t" + menssage.getText());
        } else {
            System.out.println(this.name + "\t[You received]:\t" + menssage.getText()+ "\t[from " + menssage.getUser().getName()+"]");
        }
    }



    @Override
    public void updateGroup(User user, String menssage) {
        if( user.equals(this) ) {
            System.out.println(this.getName() + "\t[Chat update]: " + "You was " + menssage);
        } else {
            System.out.println(this.getName() + "\t[Chat update]: " + user.getName() + " was " + menssage);
        }
    }

    @Override
    public String toString() {
        return this.getName() + " id: " + getId();
    }

}
