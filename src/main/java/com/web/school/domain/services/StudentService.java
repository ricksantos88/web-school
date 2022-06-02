package com.web.school.domain.services;

import com.web.school.domain.entities.student.Student;
import com.web.school.domain.repositories.StudentRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

    private StudentRepository studentRepository;

    public Student presistNewStudent(Student student) {
        return studentRepository.save(student);
    }

}
