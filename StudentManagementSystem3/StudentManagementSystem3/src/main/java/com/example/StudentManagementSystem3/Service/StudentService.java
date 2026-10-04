package com.example.StudentManagementSystem3.Service;

import com.example.StudentManagementSystem3.Entity.Student;
import com.example.StudentManagementSystem3.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    // Add Student
    public Student addStudent(Student student) {
        return repository.save(student);
    }

    // Get All Students
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // Get Student By ID
    public Student getStudentById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    // Update Student
    public Student updateStudent(Integer id, Student updatedStudent) {

        Student student = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        student.setName(updatedStudent.getName());
        student.setEmail(updatedStudent.getEmail());
        student.setDepartment(updatedStudent.getDepartment());
        student.setAge(updatedStudent.getAge());

        return repository.save(student);
    }

    // Delete Student
    public String deleteStudent(Integer id) {

        Student student = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        repository.delete(student);

        return "Student deleted successfully";
    }
}
