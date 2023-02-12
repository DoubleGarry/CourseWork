package CourseWork1;
public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Александр Викторович", 1, 45000);
        employees[1] = new Employee("Семенов Семен Семенович", 3, 30000);
        employees[2] = new Employee("Андреев Андрей Андреевич", 4, 55000);
        employees[3] = new Employee("Шураков Анатолий Владимирович", 2, 50000);
        employees[4] = new Employee("Авдеев Сергей Николаевич", 2, 55000);
        employees[5] = new Employee("Иванов Алексей Николаевич", 3, 50000);
        employees[6] = new Employee("Корпачев Богдан Андреевич", 5, 90000);
        employees[7] = new Employee("Грудинин Алексей Дмитриевич", 4, 40000);
        employees[8] = new Employee("Вешеславцев Алексей Евгеньевич", 4, 60000);
        employees[9] = new Employee("Кононов Сергей Александрович", 5, 80000);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Сумма зарплат: " + printTotalSalary());
        System.out.println("Максимальная зарплата: " + findMaxSalary());
        System.out.println("Минимальная зарплата: " + findMinSalary());
        System.out.println("Средняя зарплата: " + findAverageSalary());
        System.out.println(printFullsNames());

    }

    public static int printTotalSalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary = totalSalary + employee.getSalary();
        }
        return totalSalary;
    }

    public static Employee findMaxSalary() {
        int maxSalary = 0;
        Employee employee = null;
        for (Employee emp : employees) {
            if (emp.getSalary() > maxSalary) {
                maxSalary = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }
    public static Employee findMinSalary() {
        int minSalary = 1000000;
        Employee employee = null;
        for (Employee emp : employees) {
            if (emp.getSalary() < minSalary) {
                minSalary = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }
    public static double findAverageSalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary = totalSalary + employee.getSalary();
        }
        return totalSalary/(double)employees.length;
    }
    public static String printFullsNames(){
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
        return null;
    }
}