package lab4;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }

	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle(6,166); 
		Rectangle rectangle2 = new Rectangle(6,0);  
		int area1 = rectangle1.calculateArea();
		int area2 = rectangle2.calculateArea();

		if (area1 > area2) {
		  
			System.out.println("Rectangle1 > Rectangle2");
		        
		} else if (area1 < area2) {
		           
			System.out.println("Rectangle1 < Rectangle2");
		       
		} else {
		           
		     System.out.println("They are equal");
		        }
		    }
	}