package collection.hospitalManagement;

public class Patient {
	
	public Patient(String patientName, int patientage, String issue) {
		super();
		this.patientName = patientName;
		this.patientage = patientage;
		this.issue = issue;
	}
	
	private String patientName;
	private int patientage;
	private String issue;
	
	public String getPatientName() {
		return patientName;
	}
	
	public int getPatientage() {
		return patientage;
	}
	public String getIssue() {
		return issue;
	}

	@Override
	public String toString() {
		return "Patient Name = " + patientName + ", Patient age =" + patientage + ", Issue =" + issue ;
	}
	

}
