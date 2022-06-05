package com.web.school.domain.facade;

import com.web.school.base.BaseTest;
import com.web.school.domain.services.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class CreateStudentFacadeTest extends BaseTest {

    @InjectMocks
    private CreateStudentFacade createStudentFacade;

    @Mock
    private StudentService studentService;

    @Test
    @DisplayName("should create a new student")
    public void shouldCreateANewStudent() {

    }




}