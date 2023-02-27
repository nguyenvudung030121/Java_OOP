/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABSTRACT_ManagePhone;

/**
 *
 * @author ASUS
 */
public class UserPhoneInfo {
    private String name;
    private String phone;

    public UserPhoneInfo(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserPhoneInfo{" + "name=" + name + ", phone=" + phone + '}';
    }
    
    
    
}
