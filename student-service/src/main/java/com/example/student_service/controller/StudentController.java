package com.example.student_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/student")
    public List<String> getStudents(){
        var list = List.of("aman","Gurtej","Babbu", "Gagan");
        return list;
    }


}
