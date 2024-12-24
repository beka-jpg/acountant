package dao;


import module.Employee;

public interface EmployeeInterface {
    int calculateSalary(Employee employee);
    void displayInfo(Employee employee);
}
