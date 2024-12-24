package dao;

import module.Accountant;
import module.Employee;

public interface AccountantInterface {
    Employee[] addEmployee(Employee employee, Accountant accountant);
    int performAction(int a, int b, String operator);
}
