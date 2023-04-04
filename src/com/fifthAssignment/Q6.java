package com.fifthAssignment;


class Rectangle1 {
    private double length;
    private double breadth;
    
    public Rectangle1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double getArea() {
        return length * breadth;
    }
    
    public double getPerimeter() {
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle1 {
    public Square(double side) {
        super(side, side);
    }
}
public class Q6 {

	public static void main(String[] args) {

		Rectangle1 rect = new Rectangle1(5, 10);
        System.out.println("Rectangle area: " + rect.getArea());
        System.out.println("Rectangle perimeter: " + rect.getPerimeter());
        
        Square sq = new Square(7);
        System.out.println("Square area: " + sq.getArea());
        System.out.println("Square perimeter: " + sq.getPerimeter());
    }
	}
