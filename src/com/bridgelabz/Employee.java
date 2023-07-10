package com.bridgelabz;

public class Employee {
    String name;
    double salary;
    int id;


    public Employee( int id,String name,double salary) {
        this.name = name;
        this.id = id;
        this.salary=salary;
    }
    public void print(){
        salary=calculateYearlySalary();
        System.out.println("Name:"+name+" Yearly Salary:"+salary);
    }
    public double calculateYearlySalary(){
        return salary*12;
    }

    public static void main(String[] args) {
        Employee employee1=new Employee(1,"Swapnil",40000);
        Employee employee2=new Employee(2,"Sheetal",50000);
        employee1.print();
        employee2.print();
    }
}
