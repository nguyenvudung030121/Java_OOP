/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author ASUS
 */
public class OOP_Circle {

    private double radius;
    private String color;

    public OOP_Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public OOP_Circle() {
        radius = 1.0;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "OOP_Circle{" + "radius=" + radius + ", color=" + color + '}';
    }

    public static void main(String args[]) {

        OOP_Circle c1 = new OOP_Circle();
        OOP_Circle c2 = new OOP_Circle(3.14);
        c1.setColor("blue");
        c1.setRadius(2.2);

        System.out.println("Mau cua c1 la: " + c1.getColor());
        System.out.println("Area c1: " + c1.getArea());
        System.out.println("Circum c1: " + c1.getCircumference());

        System.out.println();

        System.out.println("Mau cua c2 la: " + c2.getColor());
        System.out.println("Area c2: " + c2.getArea());
        System.out.println("Circum c2: " + c2.getCircumference());

        System.out.print(c1);

    }
}
