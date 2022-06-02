package com.web.school.domain.entities.student;

import com.web.school.domain.entities.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Entity
@Table(name = Student.TABLE_NAME)
public class Student extends BaseModel {

    protected static final String TABLE_NAME = "STUDENT";

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_STUDENT")
    private Long id;

    @Column
    private String name;

    @Column
    private LocalDate birthDate;


}
