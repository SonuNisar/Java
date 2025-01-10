package lab8;

class Shape {

    public double getArea() {
        return 0; 
    }
}
class Circle extends Shape {
    int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius; 
    }
}
class Square extends Shape {
    int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height; 
    }
}

public class Mainshapeee {

	public static void main(String[] args) {
	
		        Shape circle = new Circle(4); 
		        Shape square = new Square(3);
		        Shape rectangle = new Rectangle(6, 9); 

		        System.out.println("Circle Area: " + circle.getArea());
		        System.out.println("Square Area: " + square.getArea()); 
		        System.out.println("Rectangle Area: " + rectangle.getArea());
	}

}
