/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payrollsystem;

/**
 *
 * @author User
 */
    
public class PartTimeEmployee extends Employee {
    // 1. Three Attributes
    private double hourlyRate;
    private int hoursWorked;
    private double overtimePay;

    // 2. Constructor
    public PartTimeEmployee(String name, int id, String jobTitle, double hourlyRate, int hoursWorked) {
        super(name, id, jobTitle);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.overtimePay = 0; 
    }

    // 3. Method 1 (Overridden)
    @Override
    public double calculateSalary() {
        return (hourlyRate * hoursWorked) + overtimePay;
    }
    
    @Override
    public String getDetails() {
        return super.getDetails() + 
               "\n   [Type: Part-Time]" +
               "\n   Hourly Rate: RM " + hourlyRate + 
               "\n   Hours Worked: " + hoursWorked;
    }

    // 4. Method 2 Add Hours
    public void addHours(int extraHours) {
        this.hoursWorked += extraHours;
    }
}