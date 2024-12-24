package module;

import java.util.Arrays;

public class Accountant {
    private Employee[] employees;


    public Accountant(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }
}



