package CourseWork1;

public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private static int id;

    public String getFullName() {
        return fullName;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getId() {
        return id;
    }


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id++;
    }

    @Override
    public String toString() {
        return "Сотрудник - " + "ФИО: " + fullName +
                '\'' + ", отдел: " + department + ", зарплата: " + salary + '}';
    }
}
