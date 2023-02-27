/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABSTRACT_ManagePhone;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ManageBook {

    public static void main(String args[]) {

        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. ShowInfo");
            System.out.println("6. Exit");
            System.out.print("YOUR CHOOSE: ");

            Scanner sc = new Scanner(System.in);

            int choose = sc.nextInt();

            switch (choose) {
                case 1: {
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Phone: ");
                    String phone = sc.next();

                    phoneBook.insertPhone(name, phone);

                    break;
                }
                case 2: {
                    System.out.println("Name of user need to remove: ");
                    String name = sc.next();
                    phoneBook.removePhone(name);
                    break;

                }
                case 3: {
                    break;

                }
                case 4: {
                    System.out.println("Name of user need to search: ");
                    String name = sc.next();
                    phoneBook.searchPhone(name);
                    break;

                }
                case 5: {
                    System.out.println("List of phoneBook: ");
                    phoneBook.infoUser();
                    break;

                }
                default:
                    System.out.println("EXIT !");
                    return;
            }
        }
    }
}
