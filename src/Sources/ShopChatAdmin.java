/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sources;

/**
 *
 * @author Thiwanka
 */
public abstract class ShopChatAdmin {

    ChatHandle ch;
    
    public abstract void setCh(ChatHandle ch);
    public abstract ChatHandle getCh();

    public abstract void setFirstName(String firstName);

    public abstract void setLastName(String lastName);

    public abstract void setArea(String area);

    public abstract String getArea();

    public abstract String getFirstName();

    public abstract String getLastName();

}
