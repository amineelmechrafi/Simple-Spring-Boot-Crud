package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @Autowired
    StudentService list;


    @GetMapping("/list")
    public List<StudentModel> getAll() {
        return list.getAll();
    }

    @PostMapping("/add")
    public void saveStudent(@RequestBody StudentModel studentModel) {
        list.saveStudent(studentModel);
    }


}