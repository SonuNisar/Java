package lab6;

class Student {
    String name;
    int age;
    String department;
    
    public Student() {
        this.name = "unknown";
        this.age = 20;
        this.department = "unassigned";
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "CS";
    }
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

public class MainStuname {

	public static void main(String[] args) {
		        Student student1 = new Student();
		        Student student2 = new Student("sonu", 22);
		        Student student3 = new Student("ammu", 21, "Information Science");

		     
		        student1.displayDetails();
		        student2.displayDetails();
		        student3.displayDetails();
		}

	}
