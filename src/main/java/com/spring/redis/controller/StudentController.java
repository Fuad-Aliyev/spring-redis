package com.spring.redis.controller;

import com.spring.redis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public void add() {
        studentService.save();
    }

    @DeleteMapping("/delete")
    public void delete() {
        studentService.delete();
    }

    @PutMapping("/update")
    public void update() {
        studentService.update();
    }
}
