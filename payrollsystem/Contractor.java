/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payrollsystem;

/**
 *
 * @author User
 */

public class Contractor extends Employee {
    // 1. Three Attributes
    private double maxFee;
    private boolean isProjectCompleted;
    private int contractDuration; 

    // 2. Constructor
    public Contractor(String name, int id, String jobTitle, double maxFee, boolean isProjectCompleted, int duration) {
        super(name, id, jobTitle);
        this.maxFee = maxFee;
        this.isProjectCompleted = isProjectCompleted;
        this.contractDuration = duration;
    }

    // 3. Method 1 (Overridden)
    @Override
    public double calculateSalary() {
        if (isProjectCompleted) {
            return maxFee;
        } else {
            return 0.0;
        }
    }
    public String getDetails() {
        String status;
            if (isProjectCompleted) {
                status = "Completed";
            } else {
                status = "In Progress";
            }

            return super.getDetails() + 
                 "\n   [Type: Contractor]" +
                 "\n   Project Fee: RM " + maxFee + 
                 "\n   Status: " + status +
                 "\n   Duration: " + contractDuration + " days";
        }

    // 4. Method 2 
    public void completeProject() {
        this.isProjectCompleted = true;
    }
}