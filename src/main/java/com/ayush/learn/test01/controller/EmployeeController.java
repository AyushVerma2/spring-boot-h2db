package com.ayush.learn.test01.controller;

import com.ayush.learn.test01.entity.Student;
import com.ayush.learn.test01.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/name")

    public  List<?> getName(){

        List<Student> allData =studentRepo.findAll();

        return allData;
    }

    @PostMapping("/save/{name}")
    public void saveStudent(@PathVariable String name){

        studentRepo.save(new Student(name));
        System.out.println("Saved Succesfully");
    }

}
