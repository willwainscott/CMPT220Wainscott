import java.util.ArrayList;

public class Course {
	
	private String courseName;
	private ArrayList<String> students = new ArrayList<String>();
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String studentName) {
		students.add(studentName);
	}
	
	public ArrayList<String> getStudents(){
		return students;
	}
	
	public int getNumberOfStudents() {
		return students.size();
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		students.remove(student);
	}
	
	public void clear() {
		students.clear();
	}

}
