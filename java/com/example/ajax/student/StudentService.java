package com.example.ajax.student;

import java.util.List;

import com.example.ajax.student.entity.Student;

public interface StudentService {
	
	public Student save(Student student);
	public Student update(Student student);
	public Student get(Long id);
	public boolean deleteById(Long id);
	public List<Student> listAll();

}
