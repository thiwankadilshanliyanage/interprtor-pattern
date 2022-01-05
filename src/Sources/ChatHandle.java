/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sources;

import GUI.Home;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextArea;

/**
 *
 * @author Thiwanka
 */
public class ChatHandle {

    HashMap<ShopChatAdmin, String> map = new HashMap<>();
    Buyer buyer;
    Seller seller;
    JTextArea ta;

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public void setReciverMsg(ShopChatAdmin admin, String msng) {
        map.put(admin, msng);
        if (msng.matches("^(.+)@(.+)$")) {
            msng = "Emails are Not valid in this Conversion";
        } else if (msng.matches("^\\+(?:[0-9] ?){6,14}[0-9]$")) {
            msng = "Phone Numbers are Not valid in this Conversion";
        }
        if (Home.scrn1 == null || Home.scrn2 == null) {
            Home.setMsg(Home.getMsg() + "\n" + admin.getFirstName() + " : No Partner in this Conversion");
        } else {
            Home.setMsg(Home.getMsg() + "\n" + admin.getFirstName() + " : " + msng);
        }
    }

    public HashMap<ShopChatAdmin, String> getMap() {
        return map;
    }

    public void load() {
        for (Map.Entry<ShopChatAdmin, String> entry : map.entrySet()) {
            ShopChatAdmin key = entry.getKey();
            String value = entry.getValue();
            ta.setText(key.getFirstName() + " : " + value);
        }
    }

}
