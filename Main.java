public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Java Kampı");
		Course course2 = new Course(2,"C++ Kampı");
		
		Course[]courses = {course1,course2};
		
		for (Course course:courses) {
			System.out.println(course.course_name);
		}
	}
	

}
