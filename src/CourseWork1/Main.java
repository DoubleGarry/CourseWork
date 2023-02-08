package CourseWork1;

public class Main {
    public static void main(String[] args) {
        Employee[] x = new Employee[10];
        x[0] = new Employee("Иванов Иван Иванович", 1, 15000);
        x[1] = new Employee("Семенов Семен Семенович", 3, 30000);
        x[2] = new Employee("Иванов Семен Николаевич", 4, 50000);
        for (Employee employee : x) {
            System.out.println(employee);
        }
    }
}