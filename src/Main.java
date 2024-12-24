import com.sun.security.jgss.GSSUtil;
import dao.AccountantInterface;
import dao.EmployeeInterface;
import dao.imp.AccountantImplements;
import dao.imp.EmployeeImplements;
import module.Accountant;
import module.Employee;

import java.util.Scanner;

public class Main {
    static AccountantInterface accountantInterface = new AccountantImplements();
    static EmployeeInterface employeeInterface = new EmployeeImplements();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Employee employee01 = new Employee(
                "Jon",
                190,
                100
        );

        Employee employee02 = new Employee(
                "Make",
                170,
                110
        );

        Employee employee03 = new Employee(
                "Mile",
                160,
                120
        );

        Employee employee04 = new Employee(
                "Frame",
                150,
                110
        );

        Accountant accountant = new Accountant(
                new Employee[]{
                        employee01, employee02, employee03, employee04
                }
        );






        boolean isTrue = true;

        while (isTrue){
            menu();
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    scanner.nextLine();

                    System.out.println("Введите имя ");
                    String name = scanner.nextLine();



                    System.out.println("Введите сколько часов проработал  сотрудник за месяц ");
                    int workedHoursMonth = scanner.nextInt();


                    System.out.println("Введите ставку для сотрудника ");
                    int hourlyRate = scanner.nextInt();

                    Employee newEmployee = new Employee(name, workedHoursMonth, hourlyRate);

                    Employee[] newEmployees =  accountantInterface.addEmployee(newEmployee, accountant);
                    accountant.setEmployees(newEmployees);

                    for (Employee employee : newEmployees){
                        System.out.println(employee);
                    }

                    break;
                case 2:

                    Employee[] employees = accountant.getEmployees();

                    for (Employee employee : employees ){
                        int res = employeeInterface.calculateSalary(employee);
                        System.out.println(employee.getName());
                        System.out.println(res);
                    }


                    break;
                case 3:

                    Employee[] result = accountant.getEmployees();

                    for (int i = 0; i < result.length; i++){
                        System.out.println(i  +  " " + result[i].getName());
                    }

                    System.out.println("Выбирите соотрудника");

                    choice = scanner.nextInt();


                    employeeInterface.displayInfo(result[choice]);

                    break;
                case 4:
                    System.out.println("Первое значение");
                    int a = scanner.nextInt();

                    System.out.println("Второе значение ");
                    int b = scanner.nextInt();

                    scanner.nextLine();

                    System.out.println("Выберите операцию: +, -, *, /");
                    String operator = scanner.nextLine();

                    System.out.println(accountantInterface.performAction(a, b, operator));


                    break;
            }
        }
    }



    public static  void menu(){

        System.out.println("""
                1.Добавить нового соотрудника
                2.Рассчитать зарплату для всех сотрудников
                3.Показать информация о сотрудниках
                4.Калькулятор
                """);
    }


}