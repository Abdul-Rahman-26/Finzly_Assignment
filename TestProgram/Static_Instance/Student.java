package TestProgram.Static_Instance;

public class Student {
	private long studentID;
	private String name;
	private static int totalStudent = 0;
	
	Student(long studentID,String name){
		this.studentID = studentID;
		this.name = name;
	}
	
	void enroll() {
		totalStudent++;
		System.out.println(" Enrolled");
	}
	
	void drop() {
		totalStudent--;
		System.out.println(" Dropped");
	}
	
	public static int totalStudentCount() {
		return totalStudent;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(20194001,"AB");
		Student s2 = new Student(20194045,"Thiya");
		Student s3 = new Student(20194013,"Dilli");
		System.out.print("Hi,"+s1.name);
		s1.enroll();
		System.out.print("Hi,"+s2.name);
		s2.enroll();
		System.out.print("Hi,"+s3.name);
		s3.enroll();
		System.out.println("Total Number of Student "+totalStudentCount());

		System.out.print("Hey,"+s1.name+" you have");
		s1.drop();
		System.out.println("Total Number of Student "+totalStudentCount());
		
	}
}
