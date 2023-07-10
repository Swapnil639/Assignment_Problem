package com.bridgelabz;

public class Student {
    String name;
    int age;
    int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void print(){
        System.out.println("Name:"+name+", Age:"+age);
    }

    public static void main(String[] args) {
        Student s1=new Student("Swapnil",24,1);
        Student s2=new Student("Sheetal",21,2);
        s1.print();
        s2.print();
    }
}
