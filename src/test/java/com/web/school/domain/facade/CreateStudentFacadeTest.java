package com.web.school.domain.facade;

import com.web.school.base.BaseTest;
import com.web.school.domain.services.StudentService;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class CreateStudentFacadeTest extends BaseTest {

    @InjectMocks
    private CreateStudentFacade createStudentFacade;

    @Mock
    private StudentService studentService;




}