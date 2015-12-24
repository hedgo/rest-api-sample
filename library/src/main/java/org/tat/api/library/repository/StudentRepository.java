package org.tat.api.library.repository;

import java.util.List;

import org.tat.api.library.model.Student;

public interface StudentRepository {

	void saveStudent(Student user);

	List<Student> getStudents();

	void deleteStudent(int id);

	Student getStudent(int id);

	void updateStudent(Student user);
}