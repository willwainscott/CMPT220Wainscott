
public class CourseTest {
	
	public static void main(String[] args) {
		
		Course testCourse = new Course("Math");
		
		testCourse.addStudent("Bob");
		testCourse.addStudent("Joe");
		testCourse.addStudent("Mary");
		
		for (int i = 0; i < testCourse.getNumberOfStudents(); i++) {
			System.out.print(testCourse.getStudents()[i] + " ");
		}
		System.out.print("\nNumber of Students: " + testCourse.getNumberOfStudents() + "\n");
		
		testCourse.dropStudent("Bob");
		
		for (int i = 0; i < testCourse.getNumberOfStudents(); i++) {
			System.out.print(testCourse.getStudents()[i] + " ");
		}
		System.out.print("\nNumber of Students: " + testCourse.getNumberOfStudents() + "\n");
	}
}
