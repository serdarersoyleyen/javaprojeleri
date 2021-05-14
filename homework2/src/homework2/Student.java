package homework2;

public class Student extends User{
	String studentNumberString;
	String[] lessons;
	
	public String[] getLessons() {
		return lessons;
	}
	public void setLessons(String[] lessons) {
		this.lessons = lessons;
	}
	public String getStudentNumberString() {
		return studentNumberString;
	}
	public void setStudentNumberString(String studentNumberString) {
		this.studentNumberString = studentNumberString;
	}
	
}
