package com.bridgelabz.Review;

import java.util.ArrayList;
import java.util.Scanner;
public class Company {

    String companyName;

    public Company(String companyName) {
        this.companyName = companyName;
    }
    public Company(){

    }
    ArrayList<Employee> emp1 = new ArrayList<Employee>();

   void  addEmployee() {
       Company company = new Company();
       Scanner sc = new Scanner(System.in);
       System.out.println("enter company name");
       company.companyName = sc.next();
       System.out.println("enter the no of  employee");
       int employeeNo = sc.nextInt();

       for (int i = 0; i < employeeNo; i++) {
           System.out.println("Enter Details of Employee No "+ (i+1));
           Employee emp = new Employee();
           System.out.println("enter the name");
           String name = sc.next();
           emp.setName(name);
           System.out.println("enter the age");
           int age = sc.nextInt();
           emp.setAge(age);
           System.out.println("enter the phone number");
           long phoneNumber = sc.nextLong();
           emp.setPhoneNumber(phoneNumber);
           System.out.println("enter the city");
           String city = sc.next();
           emp.setCity(city);
           System.out.println("enter the state");
           String state = sc.next();
           emp.setState(state);
           System.out.println("enter the department");
           String department = sc.next();
           emp.setDepartment(department);

           company.emp1.add(emp);


          //System.out.println(company);
           // System.out.println(emp1);
//           System.out.println("enter option 1 for add another employee 2 for exit");
//           int option = sc.nextInt();
//           switch (option) {
//               case 1:
//                   addEmployee();
//               case 2:
//                   break;
           }
       System.out.println(company);

       }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", emp1=" + emp1 +
                '}';
    }
}






