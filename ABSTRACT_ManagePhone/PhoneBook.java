/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABSTRACT_ManagePhone;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author ASUS
 */
public class PhoneBook extends Phone {

    ArrayList<UserPhoneInfo> phoneList;

    public void infoUser() {
        this.phoneList.forEach(user -> System.out.println(user.toString()));
//        System.out.print(phoneList);
    }

    public PhoneBook() {
        this.phoneList = new ArrayList<>();
    }

    @Override
    void insertPhone(String name, String phone) {
        UserPhoneInfo user = new UserPhoneInfo(name, phone);
        phoneList.add(user);
    }

    @Override
    void removePhone(String name) {
        phoneList.removeIf(user -> (Objects.equals(user.getName(), name)));
    }

    @Override
    void updatePhone(String name, String newphone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void searchPhone(String name) {
        System.out.println(this.phoneList.stream().filter(user -> user.getName().equals(name)).findFirst().orElse(null));
    }

    @Override
    void sort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
