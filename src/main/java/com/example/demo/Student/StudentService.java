package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<StudentModel> getAll(){
        return  studentRepository.findAll();
    }
    public void saveStudent(StudentModel studentModel){
         studentRepository.save(studentModel);
    }



}
