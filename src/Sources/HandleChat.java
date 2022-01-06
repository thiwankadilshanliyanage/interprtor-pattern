/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sources;

import GUI.Main;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Thiwanka
 */
public class HandleChat {

    HashMap<Admin, String> map = new HashMap<>();
    Buyer buyer;
    Seller seller;
    JTextArea ta;

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public void setReciverMsg(Admin admin, String msng) {
        map.put(admin, msng);
        if (msng.matches("^(.+)@(.+)$")) {
            msng = "prohibited-Emails are Not valid in this Conversion";
        } else if (msng.matches("^\\+(?:[0-9] ?){6,14}[0-9]$")) {
            msng = "prohibited-Phone Numbers are Not valid in this Conversion";
        }
        if (Main.scrn1 == null || Main.scrn2 == null) {
            Main.setMsg(Main.getMsg() + "\n" + admin.getFirstName() + " : Not anyone for chat");
        } else {
            Main.setMsg(Main.getMsg() + "\n" + admin.getFirstName() + " : " + msng);
        }
    }

    public HashMap<Admin, String> getMap() {
        return map;
    }

    public void load() {
        for (Map.Entry<Admin, String> entry : map.entrySet()) {
            Admin key = entry.getKey();
            String value = entry.getValue();
            ta.setText(key.getFirstName() + " : " + value);
        }
    }

}
