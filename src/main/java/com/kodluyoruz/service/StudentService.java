package com.kodluyoruz.service;

import com.kodluyoruz.model.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {

    @Autowired
    RestTemplate restTemplate;

    private final String BaseURI = "http://localhost:8095/student/v1";

    public ResponseEntity<StudentDto[]> getAllStudents(){
        return restTemplate.getForEntity(BaseURI+"/studentList", StudentDto[].class);
    }

    public StudentDto getStudentsByName(String name){
        ResponseEntity<StudentDto> responseEntity = restTemplate.getForEntity(BaseURI + "/getStudentByName?name=" + name, StudentDto.class);
        StudentDto student = responseEntity.getBody();
        return student;
    }
}
