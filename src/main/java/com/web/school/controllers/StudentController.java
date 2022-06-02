package com.web.school.controllers;

import com.web.school.domain.dto.CreateStudentDTO;
import com.web.school.domain.dto.StudentDTO;
import com.web.school.domain.facade.CreateStudentFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class StudentController {

    public static final String BASE_URL = "/student";
    public static final String POST_CREATE_STUDENT = BASE_URL;
    public static final String GET_FIND_BY_DOCUMENT_URL = BASE_URL + "/document/{document}";
    public static final String GET_FIND_BY_QUERY = BASE_URL + "/query";

    private final CreateStudentFacade createStudentFacade;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(POST_CREATE_STUDENT)
    public StudentDTO createStudent(@RequestBody @Valid CreateStudentDTO createStudentDTO) {
        return createStudentFacade.createStudent(createStudentDTO);
    }

}
