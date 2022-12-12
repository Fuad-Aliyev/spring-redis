package com.spring.redis.service;

import com.spring.redis.entity.Student;
import com.spring.redis.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student save() {
        Student student = new Student("Eng2015001", "John Doe", Student.Gender.MALE, 1);
        studentRepository.save(student);
        return get("Eng2015001");
    }

    public Student update() {
        Student retrievedStudent = get("Eng2015001");;
        retrievedStudent.setName("Richard Watson");
        studentRepository.save(retrievedStudent);
        return get("Eng2015001");
    }

    public void delete() {
        Student student = get("Eng2015001");
        studentRepository.deleteById(student.getId());
    }

    public Student get(String id) {
        return studentRepository.findById(id).get();
    }
}
