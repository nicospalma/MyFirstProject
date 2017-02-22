package com.company.Classes;

/**
 * Created by JPMC-PC08 on 17/02/2017.
 */
public class Person {
    String firstName;
    String lastName;
    String email;
    String userName;
    String password;
    int age;

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age)
    {
        this.age = age;

    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {

        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {

        return password;
    }

    public int getAge() {
        return age;
    }

    public String introduceYourself(String firstName, String lastName){
        //this.firstName = firstName;
       // this.lastName = lastName;
        return  firstName + " " + lastName ;
    }



    public String printOut() {
            return "Hi I am ";
        }
}
