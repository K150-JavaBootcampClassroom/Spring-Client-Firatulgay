package com.kodluyoruz.controller;

import com.kodluyoruz.model.StudentDto;
import com.kodluyoruz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student/client")
public class StudentClientController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getAllStudents")
    public ResponseEntity<StudentDto[]> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/getStudentsByName")
    public StudentDto getStudentsByName(@RequestParam String name){
        return studentService.getStudentsByName(name);
    }

}
