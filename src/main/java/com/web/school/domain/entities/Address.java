package com.web.school.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.web.school.domain.entities.student.Student;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Data
@Entity
@Table(name = Address.TABLE_NAME)
public class Address {

    protected static final String TABLE_NAME = "ADDRESS";

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_ADDRESS")
    private Long id;

    @Column
    private String postalCode;

    @Column
    private String street;

    @Column
    private String number;

    @Column
    private String complement;

    @Column
    private String neighbourhood;

    @Column
    private String city;

    @Column
    private String state;

    @OneToOne
    @JoinColumn(name = "ID_STUDENT")
    @ToString.Exclude
    @JsonIgnore
    private Student student;

}
