package com.example.StudentManagementSystem3.Repository;

import com.example.StudentManagementSystem3.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}