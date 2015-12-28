package org.tat.api.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tat.api.library.model.Address;
import org.tat.api.library.model.Student;
import org.tat.api.library.repository.StudentRepository;

@Service("StudentService")
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository dao;

	public void saveStudent(Student Student) {
		dao.saveStudent(Student);
	}

	public List<Student> getStudents() {
		return dao.getStudents();
	}

	public void deleteStudent(int id) {
		dao.deleteStudent(id);
	}

	public Student getStudent(int id) {
		return dao.getStudent(id);
	}
	
	public Address getStudentAddress(int id) {
		return dao.getStudentAddress(id);
	}

	public void updateStudent(Student Student) {
		dao.updateStudent(Student);
	}
	
}
