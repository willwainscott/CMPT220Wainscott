
public class Course {
	
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		if (numberOfStudents < students.length) {
			students[numberOfStudents] = student;
			numberOfStudents++;
		} else {
			String[] oldArray = students.clone();
			String[] students = new String[this.students.length * 2];
			for (int i = 0; i < students.length; i++) {
				students[i] = oldArray[i];
			}
		}
		
	}
	
	public String[] getStudents() {
		String[] newStudentsArray = new String[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
			newStudentsArray[i] = students[i];
		}
		return newStudentsArray;	
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == student) {
				for (int j = i; j < students.length - 1 ; j++) {
					students[j] = students[j + 1];
				}
				numberOfStudents--;
			}
		}
	}
	
	public void clear() {
		String[] students = new String[100];
		numberOfStudents = 0;
	}
}
