package com.example.StudentManagementSystem;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();
    public StudentService(){
        students.add(new Student(1,"Akash","AI"));
        students.add(new Student(2,"Bala","Blockchain"));
    }
    public List<Student> getStudents(){
        return students;
    }
    public Student getStdByRno(int rollno){
        for(Student student : students){
            if(student.getRno()==rollno){
                return student;
            }
        }
        return null;
    }
    public void addStudent( Student student){

        students.add(student);
    }
    public String updateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRno() == student.getRno()) {
                students.set(i, student);
                return "Updation Done";
            }
        }
        return "No Student data exist";
    }
    public String deleteStudent(int rno) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRno() == rno) {
                students.remove(i);
                return "Student deleted successfully";
            }
        }
        return "No data exist";
    }

}

