/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACE_Employee;

/**
 *
 * @author ASUS
 */
public class Entry {

    public static void main(String args[]) {
        IEmployee employee1 = new PartTimeEmployee("Trung", 45000, 7);
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary per day: " + employee1.calculateSalary());

        IEmployee employee2 = new FulltimeEmployee("Linh", 65000);
        System.out.println("Name: " + employee2.getName());
        System.out.println("Salary per day: " + employee2.calculateSalary());
    }
}
