package com.company.Classes;

/**
 * Created by JPMC-PC08 on 17/02/2017.
 */
public class Customer extends Person {

    String address;
    String phoneNumber;
    String customerId;

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String introduceYourself(String firstName, String lastName, int age, String address) {
        return "Hi I am a Customer. My name is" + " " + firstName + " " + lastName + " and I am already " + age + " years old.I live in " + address;
    }

    public  Customer( String firstName, String lastName, int age, String address, String phoneNumber, String customerId ){
        this.age = age;
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.customerId = customerId;

    }

    public Customer(){

    }
}
