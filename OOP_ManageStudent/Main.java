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
public class Main {

    public static void main(String args[]) {

        ManageStudent manageStudent = new ManageStudent();

        Student stuA = new CandidateA("1", "Vudung", "Quang Binh");
        Student stuB = new CandidateB("2", "ThanhTam", "Da Nang");
        Student stuC = new CandidateC("3", "Minh Duc", "Ha Tinh");

        manageStudent.addStudent(stuA);
        manageStudent.addStudent(stuB);
        manageStudent.addStudent(stuC);
        
        manageStudent.infoStudent();
        
        System.out.println();
        
        System.out.println(manageStudent.searchById("2"));

    }
}
