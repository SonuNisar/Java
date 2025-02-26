package lab9;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}


public class MainShapes {

	public static void main(String[] args) {
		
		        Shape circle = new Circle(4.0);
		        Shape rectangle = new Rectangle(6.0, 7.0);

		        System.out.println("Area of Circle: " + circle.calculateArea());
		        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

	}

}
