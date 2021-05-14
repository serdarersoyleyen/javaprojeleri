package homework2;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(1);
		student.setFirstName("serdar");
		student.setLastName("Ersoyleye");
		student.setAge("24");
		student.setStudentNumberString("1981918");
		String[] tt = { "Matematik", "Müzik" };
		student.setLessons(tt);

		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("selçuk");
		student1.setLastName("kürek");
		student1.setAge("651");
		student1.setStudentNumberString("1981918");
		String[] aa = { "Matematik", "Müzik" };
		student1.setLessons(aa);

		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("hilal");
		instructor.setLastName("bodur");
		instructor.setAge("45");
		instructor.setInstructorNumber("6846846");
		instructor.setUniversityName("beykent");

		Student[] students = { student, student1 };

		for (Student student2 : students) {
			System.out.print(student2.getId() + " ");
			System.out.print(student2.getFirstName() + " ");
			System.out.print(student2.getLastName() + " ");
			System.out.println(student2.getAge());
		}

		
		UserManager userManager = new UserManager();
		userManager.addUser(student);

		StudentManager studentManager = new StudentManager();
		studentManager.giveMoney(student1);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.earnMoney(instructor);

	}

}
