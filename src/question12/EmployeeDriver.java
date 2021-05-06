/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Kandi Nandini
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employee emp1 = new Employee(1, "Nandini", 5000);
        Employee emp2 = new Employee(2, "Kandi", 4000);
        Employee emp3 = new Employee(3, "Raja", 3000);
        Employee emp4 = new Employee(4, "Reddy", 6000);
        Employee emp5 = new Employee(5, "Eknath", 5000);
 
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp1);
        employees.add(emp5);
        employees.add(emp4);
        
        //Original List
        System.out.println("Original List");       
        for(Employee emp : employees){
            
            System.out.println(emp);
            
        }
        
        //one-parameter sort method of the Collections class to sort the list by its natural order (empId number) 
        Collections.sort(employees);
        
        System.out.println("\nOne-parameter sort method of the Collections class");        
        for(Employee emp : employees){
            
            System.out.println(emp);
            
        }
        
        //Two-parameter sort method of the Collections class, supplying a new Comparator<Employee> that sorts by salary 
        // Sort employees by Salary
        Comparator<Employee> empSalaryComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if(e1.getEmpSalary()< e2.getEmpSalary()) {
                    return -1;
                } else if (e1.getEmpSalary() > e2.getEmpSalary()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        
        Collections.sort(employees, empSalaryComparator);
        
        System.out.println("\nTwo-parameter sort method of the Collections class that sorts by Salary");        
        for(Employee emp : employees){
            
            System.out.println(emp);
            
        }
        
        
        //two-parameter sort method of the Collections class, supplying a new Comparator<Employee> that sorts by name
        // Sort employees by Name
        Comparator<Employee> empNameComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getEmpName().compareTo(e2.getEmpName());
            }
        };
        
        Collections.sort(employees, empNameComparator);
        System.out.println("\nTwo-parameter sort method of the Collections class that sorts by Name");        
        for(Employee emp : employees){            
            System.out.println(emp);            
        }
        
    }
    
}
