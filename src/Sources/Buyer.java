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
public class Buyer extends Admin{

    private String firstName;
    private String lastName;
    private String area;
    
    @Override
    public void setCh(HandleChat ch) {
       this.ch=ch;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public HandleChat getCh() {
        return ch;
    }
    
    
}
