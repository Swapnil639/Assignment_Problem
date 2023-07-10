package com.bridgelabz;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        System.out.println("Circle 1:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Circumference: " + circle1.getCircumference());
        System.out.println();

        Circle circle2 = new Circle(7.5);
        System.out.println("Circle 2:");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Circumference: " + circle2.getCircumference());

    }
}
