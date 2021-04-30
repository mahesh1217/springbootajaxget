package com.example.ajax.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ajax.student.StudentService;
import com.example.ajax.student.entity.Student;



@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/listall")
	public List<Student> list(){
		return studentService.listAll();
	}
	
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		Student createResponse = studentService.save(student);
		return createResponse;
	}

	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		Student updateResponse = studentService.update(student);
		return updateResponse;
	}

	@GetMapping("/{id}")
	public Student getStudent(@PathVariable Long id) {
		Student getReponse = studentService.get(id);
		return getReponse;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		boolean result = studentService.deleteById(id);
		
		return "Record deleted: "+result;
	}

}
