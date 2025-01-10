package abstraction;

import java.util.Scanner;

abstract class Shape {
    float area;

    abstract void acceptInput();
    abstract void calcArea();

    void dispArea() {
        System.out.println("Area: " + area);
    }
}

class Square extends Shape {
    float side;

    void acceptInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the side of the square:");
        side = s.nextFloat();
    }

    void calcArea() {
        area = side * side;
    }
}

class Circle extends Shape {
    float radius;

    void acceptInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        radius = s.nextFloat();
    }

    void calcArea() {
        area = (float) (3.15 * radius * radius);
    }
}

class Rectangle extends Shape {
    float length, width;

    void acceptInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        length = s.nextFloat();
        System.out.println("Enter the width of the rectangle:");
        width = s.nextFloat();
    }

    void calcArea() {
        area = length * width;
    }
}

public class Launch {
	 void permit(Shape ref) {
	        ref.acceptInput();
	        ref.calcArea();
	        ref.dispArea();
	 }

	public static void main(String[] args) {
		        Launch l = new Launch();

		        Square square = new Square();
		        l.permit(square);

		        Circle circle = new Circle();
		        l.permit(circle);

		        Rectangle rectangle = new Rectangle();
		        l.permit(rectangle);
		    }
		
	}


