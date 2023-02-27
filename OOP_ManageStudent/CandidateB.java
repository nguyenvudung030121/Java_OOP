/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_ManageStudent;

/**
 *
 * @author ASUS
 */
public class CandidateB extends Student{
    public static final String Toan = "Toan";
    public static final String Hoa = "Hoa";
    public static final String Sinh = "Sinh";

    public CandidateB(String id, String name, String addr) {
        super(id, name, addr);
    }

    

    @Override
    public String toString() {
       return "CandidateB{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + addr + '\'' +
                ", Subject: " + Toan + " - " + Hoa + " - " + Sinh +
                '}';
    }
    
}
