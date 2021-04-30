package com.example.ajax.student.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ajax.student.StudentRepository;
import com.example.ajax.student.StudentService;
import com.example.ajax.student.entity.Student;
import com.example.ajax.student.*;


@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> listAll() {
		return studentRepository.findAll();
	}
	
	

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		Student createResponse = studentRepository.save(student);
		return createResponse;
	}

	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		Student updateResponse = studentRepository.save(student);
		return updateResponse;
		
	}

	@Override
	public Student get(Long id) {
		// TODO Auto-generated method stub
		Optional<Student> studentResponse = studentRepository.findById(id);
		Student getResponse = studentResponse.get();
		return getResponse;
		
	}


    @Override
	public boolean deleteById(Long id) {
		try {
			studentRepository.deleteById(id);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}


}
