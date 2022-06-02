package com.web.school.controllers;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test@")
@WebMvcTest(controllers = StudentController.class)
@AutoConfigureWebMvc
class StudentControllerTest {

    static String STUDENT_API = "/student";

    @Autowired
    MockMvc mockMvc;

}