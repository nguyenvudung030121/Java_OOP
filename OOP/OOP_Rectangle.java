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
public class OOP_Rectangle {

    private float length;
    private float width;

    public OOP_Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public OOP_Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }
    
    public float getLength(){
        return length;
    }
    
    public void setLength(float length){
        this.length = length;
    }
    
    public float getWidth(){
        return width;
    }
    
    public void setWidth(float width){
        this.width = width;
    }
    
    public double getPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "OOP_Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
    
    public static void main(String args[]){
        OOP_Rectangle r1 = new OOP_Rectangle(4,2);
        
        System.out.println(r1);
        System.out.println(r1.getPerimeter());
        
    }  
}

   
