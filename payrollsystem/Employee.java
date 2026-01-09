/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payrollsystem;

public abstract class Employee {
    // 1. Three Attributes
    protected int id;
    protected String name;
    protected String jobTitle;

    // 2. Constructor
    public Employee(String name, int id, String jobTitle) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
    }

    // 3. Method 1 (Abstract)
    public abstract double calculateSalary();

    // 4. Method 2 (Concrete)
    public String getDetails() {
        return "ID: " + id + " | " + name + " (" + jobTitle + ")";
    }

}
