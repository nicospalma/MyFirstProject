package com.company.Classes;

/**
 * Created by JPMC-PC08 on 17/02/2017.
 */
public class Employee extends Person {


    String department;
    String  payGrade;
    String employeeId;

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPayGrade(String payGrade) {
        this.payGrade = payGrade;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public String getPayGrade() {
        return payGrade;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String introduceYourself(String firstName, String lastName){
        return "Hi I am an Employee" + " "+ firstName + " " + lastName ;
    }

}
