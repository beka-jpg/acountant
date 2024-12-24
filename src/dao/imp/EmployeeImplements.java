package dao.imp;

import dao.EmployeeInterface;
import module.Employee;

public class EmployeeImplements implements EmployeeInterface {
    @Override
    public int calculateSalary(Employee employee) {
        return employee.getBaseSalary();
    }

    @Override
    public void displayInfo(Employee employee) {
        System.out.println(employee.toString());
    }
}
