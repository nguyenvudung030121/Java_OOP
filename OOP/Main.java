/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import OOP_BookandAuthor.Author;
import OOP_BookandAuthor.Book;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String args[]){
        Author a1 = new Author("VuDung", "nguyenvudung030121@gmail.com");
        
        Book b1 = new Book("1223", "Kakarotto", a1, 2000, 3);
        
        System.out.println("ten tac gia: "+b1.getAuthorname());
        
        System.out.println(b1);
    }
}


