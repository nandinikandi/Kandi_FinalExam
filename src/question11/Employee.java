/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.Objects;

/**
 *
 * @author Kandi Nandini
 */
public class Employee {

    private int id;
    private String name;

    public Employee(String name, int id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        // Here I'm returning the Employee id as a hashcode value.
        // we can also return some other calculated value or 
        // may be memory address of theObject on which it is invoked.
        // it depends on how you implement hashCode() method.
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        // check if both the object references are referring to the same object.
        if (this == obj) {
            return true;
        }
        // check if the targeted object is null, if yes return false.
        if (obj == null) {
            return false;
        }

        // check if both objects are not of type Employee class, if yes return false.
        if (getClass() != obj.getClass()) {
            return false;
        }

        //Explicit casting of the argument.
        final Employee other = (Employee) obj;

        //check if id s of both object are not equal, if yes return false.
        if (this.id != other.id) {
            return false;
        }

        //check if names of both object are not equal, if yes return false.
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }

        //if all the not equals condition, return true.
        return true;
    }

}
