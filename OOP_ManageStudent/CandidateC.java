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
public class CandidateC extends Student{
    public static final String Van = "Van";
    public static final String Su = "Su";
    public static final String Dia = "Dia";

    public CandidateC(String id, String name, String addr) {
        super(id, name, addr);
    }

    

    

    @Override
    public String toString() {
       return "CandidateC{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + addr + '\'' +
                ", Subject: " + Van + " - " + Su + " - " + Dia +
                '}';
    }
}
