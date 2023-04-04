package com.fifthAssignment;


class Shape {
    double calculateArea(double x, double y) {
        return x * y;
    }
}

class Rectangle extends Shape {
    @Override
    public double calculateArea(double x, double y) {
        return x * y;
    }
}


public class Q5 {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.calculateArea(10, 5));
    }
}
