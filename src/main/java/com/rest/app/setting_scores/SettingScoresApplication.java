package com.rest.app.setting_scores;

import com.rest.app.setting_scores.dao.StudentDAO;
import com.rest.app.setting_scores.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SettingScoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SettingScoresApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {

		return runner -> {
			//createStudent(studentDAO);

			//createMultipleStudents(studentDAO);

			//readStudent(studentDAO);

			//queryForStudents(studentDAO);

			//queryForStudentsByLastName(studentDAO);

			//updateStudent(studentDAO);

			//deleteStudent(studentDAO);

			deleteAllStudents(studentDAO);
		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		// deleting all students
		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted " + numRowsDeleted + " students");
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 2;
		System.out.println("Deleting student with ID: " + studentId);
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {
		// retrieve student based on the id: primary key
		System.out.println("Getting student with id: 1");
		int studentId = 1;
		Student theStudent = studentDAO.findById(studentId);

		// change the first name to
		System.out.println("Updating student with id: " + studentId);
		theStudent.setFirstName("Balumba");

		// update the student
		System.out.println("Updated student with id: 1");
		studentDAO.update(theStudent);

		// display the student
		System.out.println(theStudent);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {

		List<Student> theStudents = studentDAO.findByLastName("omar@test.com");

		if (theStudents.isEmpty()) {
			System.out.println("No students found");
		} else {
			for (Student student : theStudents) {
				System.out.println(student);

			}
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {

		// get a list of students
		List<Student> theStudents = studentDAO.findAll();

		// display list of students
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		// create a student object
		System.out.println("Creating a new Student...");
		Student student = new Student("Lol", "Kek", "kek@mail.com");
		// save the student
		System.out.println("Saving student...");
		studentDAO.save(student);

		// display id of the saved student
		int theId = student.getId();
		System.out.println("Saved Student. ID: " + theId);

		// retrieve student based on the id
		System.out.println("Retrieving student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		// display student
		System.out.println("Found student: " + myStudent.toString());
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating a new Student objects...");
		Student tempStudent1 = new Student("Omar", "omar@test.com", "Zhadykov");
		Student tempStudent2 = new Student("Vivi", "Zhadykov", "vivi@test.com");
		Student tempStudent3 = new Student("John", "Zhadykov", "John@test.com");

		System.out.println("Saving students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("Creating a new Student...");
		Student tempStudent = new Student("Omar", "Zhadykov", "omar@test.com");

		// save the student object
		System.out.println("Saving student...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Student saved. Generated id: " + tempStudent.getId());
	}

}
