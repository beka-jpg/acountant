package module;

public class Employee {
    private String name;
    private int baseSalary;
    private int workedHoursInMonth;
    private int hourlyRate;

    public Employee(String name, int workedHoursInMonth, int hourlyRate) {
        this.name = name;
        this.workedHoursInMonth = workedHoursInMonth;
        this.hourlyRate = hourlyRate;
        this.baseSalary = workedHoursInMonth * hourlyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getWorkedHoursInMonth() {
        return workedHoursInMonth;
    }

    public void setWorkedHoursInMonth(int workedHoursInMonth) {
        this.workedHoursInMonth = workedHoursInMonth;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", workedHoursInMonth=" + workedHoursInMonth +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}





