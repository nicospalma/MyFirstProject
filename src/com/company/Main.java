package com.company;

import com.company.Classes.Customer;
import com.company.Classes.Employee;
import com.company.Classes.MyMethod;
import com.company.Classes.Person;

public class Main {

    public static void main(String[] args) {

        Person firstUser = new Person();
        Person noobUser = new Person();
        Person drugUser = new Person();


        Employee firstEmployee = new Employee();
        Customer firstCustomer = new Customer();
        Customer secCustomer = new Customer("Neil", "Agbay", 56, "Talamban Cebu", "0916890908", "14235237522");

        //Good people user

        firstUser.setFirstName("Nico");
        String firstName = firstUser.getFirstName();

        firstUser.setLastName("Gwapo");
        String lastName = firstUser.getLastName();

        firstUser.setEmail("gwapoko@gmail.com");
        String email    = firstUser.getEmail();

        firstUser.setUserName("next");
        String userName    = firstUser.getUserName();

        firstUser.setAge(18);
        int age = firstUser.getAge();

        //Noob people User

        noobUser.setFirstName("Noobjon");
        String firstName2 = noobUser.getFirstName();

        noobUser.setLastName("Vovo");
        String lastName2 = noobUser.getLastName();

        noobUser.setEmail("aljonkonoobshits@yahoo.com.ph");
        String email2    = noobUser.getEmail();

        noobUser.setUserName("d@rkEm0pr1nC3");
        String userName2    = noobUser.getUserName();

        noobUser.setAge(40);
        int age2 = noobUser.getAge();


        //Employee
        /*
        firstEmployee.setFirstName(firstUser.getFirstName());
        firstEmployee.setLastName(firstUser.getLastName());
        firstEmployee.setDepartment("HR Department");
        firstEmployee.setPayGrade("Class S");
        firstEmployee.setEmployeeId("091243254656");
        */

        //Customer
        /*
        firstCustomer.setFirstName(firstUser.getFirstName());
        firstCustomer.setLastName(noobUser.getLastName());
        firstCustomer.setAge(firstUser.getAge());
        firstCustomer.setAddress("Sitio Bakilid, USA 6000");
        firstCustomer.setPhoneNumber("09331400908");
        firstCustomer.setCustomerId("11542545733");
        */

        /*
        //Introduce yourself

        System.out.println(firstUser.printOut() + firstUser.introduceYourself(firstName2, lastName2));
        System.out.println(firstUser.printOut() + firstUser.getAge());

        //Override
        System.out.println("***************************** "  );
        System.out.println(firstEmployee.introduceYourself(firstEmployee.getFirstName(), firstEmployee.getLastName()));

        System.out.println(firstCustomer.introduceYourself(firstCustomer.getFirstName(), firstCustomer.getLastName(), firstCustomer.getAge(), firstCustomer.getAddress()));



        //Overloading Constructor

        System.out.println(secCustomer.introduceYourself(secCustomer.getFirstName(), secCustomer.getLastName(), secCustomer.getAge(), secCustomer.getAddress()));



        /*
        System.out.println("**********GOOD USER*********\n"  );
        System.out.println("FIRST NAME:\t" + firstName);
        System.out.println("LAST NAME:\t" + firstUser.getLastName());
        System.out.println("\t AGE:\t" + age);
        System.out.println("USERNAME:\t" + userName);
        System.out.println("\n**************************");

        System.out.println("*********NOOB USER********\n"  );
        System.out.println("FIRST NAME:\t" + firstName2);
        System.out.println("LAST NAME:\t" + lastName2);
        System.out.println("\t AGE:\t" + age2);
        System.out.println("USERNAME:\t" + userName2);
        System.out.println("\n**************************");

        System.out.println("EMPLOYEE NAME:\t" + firstEmployee.getFirstName());
        System.out.println("DEPARTMENT:\t" + firstEmployee.getDepartment());
        System.out.println("PAY GRADE:\t" + firstEmployee.getPayGrade());
        System.out.println("EMPLOYEE ID:\t" + firstEmployee.getEmployeeId());

        System.out.println("\n**************************");

        System.out.println("CUSTOMER NAME:\t" + firstCustomer.getFirstName());
        System.out.println("CUSTOMER ADDRESS:\t" + firstCustomer.getAddress());
        System.out.println("CUSTOMER PHONE NUMBER:\t" + firstCustomer.getPhoneNumber());
        System.out.println("CUSTOMER ID:\t" + firstCustomer.getCustomerId());
        */


        int n = 1;




//WHILE Loop

        //MyMethod.whileConditions(10);
        //MyMethod.dowhileConditions(8);
        //MyMethod.forConditions(10);
//        MyMethod.forSumPos(6);
//        MyMethod.whileSumPos(6);
//        MyMethod.factorial(6);
        MyMethod.evenIntegers(6);
    }

}
