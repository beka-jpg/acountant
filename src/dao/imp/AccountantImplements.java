package dao.imp;

import dao.AccountantInterface;
import module.Accountant;
import module.Employee;

import java.util.Arrays;

public class AccountantImplements  implements AccountantInterface {
    @Override
    public Employee[] addEmployee(Employee employee, Accountant accountant) {
        Employee[] employees = accountant.getEmployees();
        Employee[] copyEmployees = Arrays.copyOf(employees, employees.length + 1);
        copyEmployees[copyEmployees.length - 1] = employee;
        return copyEmployees;
    }


    @Override
    public int performAction(int a, int b, String operator)  {
        int c = 0;

        switch (operator){
            case "+":
                c =  a + b;
                break;
            case "-":
                c =  a - b;
                break;

            case "*":
                c =   a * b;
                break;

            case "/":
                c =  a / b ;
                break;
        }


        return c;
    }
}

