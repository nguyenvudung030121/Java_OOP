/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_ManageStudent;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ManageStudent {

    List<Student> students;

    public ManageStudent() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void infoStudent() {
        this.students.forEach(student -> System.out.println(student.toString()));
    }

    public Student searchById(String id) {
        return this.students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
    }

}
