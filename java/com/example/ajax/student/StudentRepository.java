package com.example.ajax.student;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ajax.student.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
