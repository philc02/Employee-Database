/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeDatabase;

/**
 *
 * @author miphc
 */
public class FTE extends EmployeeInfo {
    double annualSalary;
    public FTE(int employeeNumber, String firstName, String lastName, int gender, String workLocation, double deductionRate, double annualSalary, String image, String email) {
        super(employeeNumber, firstName, lastName, gender, workLocation, deductionRate, image, email);
        this.annualSalary = annualSalary;
    }
    public double calcAnnualGrossIncome(){
        return annualSalary;
    }
    public double calcAnnualNetIncome(){
        return annualSalary*(1-deductionRate);
    }
}

