// @author Rafael Figueredo Guimarães

package br.edu.ifpb;

public abstract class UserObserver extends Group {

    public abstract void update(Menssage menssage);

    public abstract void updateGroup(User user, String menssage);

}
