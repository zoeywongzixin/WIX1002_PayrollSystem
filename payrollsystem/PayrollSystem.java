/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package payrollsystem;



public class PayrollSystem {
    public static void main(String[] args) {
        
        System.out.println("=== PAYROLL SYSTEM ===");

        // 1. Array of Objects (Polymorphism)
        Employee[] employees = new Employee[3];

        // 2. Object Creation
        employees[0] = new FullTimeEmployee("Alice", 101, "Manager", 5000, 500);
        employees[1] = new PartTimeEmployee("Bob", 102, "Clerk", 20, 80);
        employees[2] = new Contractor("Charlie", 103, "Dev", 3000, true, 30);

        // 3. Loop to test the system
        for (int i = 0; i < employees.length; i++) {
            Employee emp = employees[i];
            
            System.out.println(emp.getDetails());
            System.out.printf("   >>> FINAL SALARY: RM %.2f%n", emp.calculateSalary());
            System.out.println("-----------------------------\n");
        }
    }
}