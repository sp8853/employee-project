import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeIdProject {
    private static List<Employee> employees = new ArrayList<>();
    private static Map<Integer, Employee> employeeMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        printOptions();

        while (!quit) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline not consumed by nextInt()

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    findEmployee(scanner);
                    break;
                case 3:
                    updateEmployee(scanner);
                    break;
                case 4:
                    deleteEmployee(scanner);
                    break;
                case 5:
                    printAllEmployees();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printOptions() {
        System.out.println("1. Add employee");
        System.out.println("2. Find employee");
        System.out.println("3. Update employee");
        System.out.println("4. Delete employee");
        System.out.println("5. Print all employees");
        System.out.println("6. Quit");
    }

    private static void addEmployee(Scanner scanner) {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee id: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline not consumed by nextInt()
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        Employee employee = new Employee(name, id, salary);
        employees.add(employee);
        employeeMap.put(id, employee);
        System.out.println("Employee added successfully.");
    }

    private static void findEmployee(Scanner scanner) {
        System.out.print("Enter employee id to find: ");
        int id = scanner.nextInt();
        Employee employee = employeeMap.get(id);
        if (employee != null) {
            System.out.println("Employee found: " + employee);
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void updateEmployee(Scanner scanner) {
        System.out.print("Enter employee id to update: ");
        int id = scanner.nextInt();
        Employee employee = employeeMap.get(id);
        if (employee != null) {
            scanner.nextLine(); // consume newline not consumed by nextInt()
            System.out.print("Enter new employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new employee salary: ");
            double salary = scanner.nextDouble();
            employee.setName(name);
            employee.setSalary(salary);
            System.out.println("Employee updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void deleteEmployee(Scanner scanner) {
        System.out.print("Enter employee id to delete: ");
        int id = scanner.nextInt();
        Employee employee = employeeMap.get(id);
        if (employee != null) {
            employees.remove(employee);
            employeeMap.remove(id);
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void printAllEmployees() {
        System.out.println("All employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}