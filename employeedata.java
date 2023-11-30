import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    int empAge;
    String empGender;
    String empDesignation;
    double empSalary;
    String empAddress;

    // Parameterized constructor
    public Employee(int id, String name, int age, String gender, String designation, double salary, String address) {
        empId = id;
        empName = name;
        empAge = age;
        empGender = gender;
        empDesignation = designation;
        empSalary = salary;
        empAddress = address;
    }
}
class EmployeeDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of employees
        System.out.println("Enter the number of employees: ");
        int n = scanner.nextInt();

        // Create an array of Employee objects
        Employee[] employees = new Employee[n];

        // Input: Employee details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.println("Employee Id: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            System.out.println("Employee Name: ");
            String name = scanner.nextLine();
            System.out.println("Employee Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            System.out.println("Employee Gender: ");
            String gender = scanner.nextLine();
            System.out.println("Employee Designation: ");
            String designation = scanner.nextLine();
            System.out.println("Employee Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline
            System.out.println("Employee Address: ");
            String address = scanner.nextLine();

            // Create an Employee object and add it to the array
            employees[i] = new Employee(id, name, age, gender, designation, salary, address);
        }

        // Input: Employee Id to search
        System.out.println("Enter the Employee Id to search: ");
        int searchId = scanner.nextInt();

        // Search and display details of the required employee
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.empId == searchId) {
                displayEmployeeDetails(emp);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with Id " + searchId + " not found.");
        }
    }

    // Method to display employee details
    private static void displayEmployeeDetails(Employee emp) {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee Id: " + emp.empId);
        System.out.println("Employee Name: " + emp.empName);
        System.out.println("Employee Age: " + emp.empAge);
        System.out.println("Employee Gender: " + emp.empGender);
        System.out.println("Employee Designation: " + emp.empDesignation);
        System.out.println("Employee Salary: " + emp.empSalary);
        System.out.println("Employee Address: " + emp.empAddress);
    }
}
