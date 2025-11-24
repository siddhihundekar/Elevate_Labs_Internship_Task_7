package task_7;

import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        while (true) {

            System.out.println("\n===== Employee Database App =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    sc.nextLine(); // clear buffer
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    dao.addEmployee(name, age, salary);
                    break;

                case 2:
                    dao.viewEmployees();
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Update: ");
                    int uid = sc.nextInt();

                    System.out.print("Enter New Name: ");
                    sc.nextLine();
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();

                    System.out.print("Enter New Salary: ");
                    double newSalary = sc.nextDouble();

                    dao.updateEmployee(uid, newName, newAge, newSalary);
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Delete: ");
                    int did = sc.nextInt();
                    dao.deleteEmployee(did);
                    break;

                case 5:
                    System.out.println("Thank you! Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
