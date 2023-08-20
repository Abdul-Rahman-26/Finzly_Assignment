package ex_Constructor;

public class Student {
	private String name;
	private int age;
	private int studentID  ;

	
	Student(){
		this.name="Unknown";
		this.age = 0;
		this.studentID = incrStudent();
	}
	
	private static int unique = 0001;
	private int incrStudent() {
		return unique++;
	}

	Student(String name, int age){
		this.name = name;
		this.age =age;
		this.studentID = incrStudent();
	}
	
	Student(String name, int age,int studentID){
		this.name = name;
		this.age = age;
		this.studentID = studentID;
	}
	
	void display() {
		System.out.println("Student name : " +name +"\n" + "Student ID : " +studentID +"\n"+"Student age : "+age);
	}
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student("AB",21);
		Student student3 = new Student("Thiya",21,4045);
		
		student1.display();
		student2.display();
		student3.display();
	}
}
