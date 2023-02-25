/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_BookandAuthor;

/**
 *
 * @author ASUS
 */
public class Book {
    private String id;
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String id, String name, Author author, double price, int qty) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public String getAuthorname(){
        return author.getName();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty + '}';
    }
    
    

}
