package com.web.school.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.web.school.domain.entities.student.Student;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Entity
@Table(name = Contact.TABLE_NAME)
public class Contact {

    protected static final String TABLE_NAME = "CONTACT";

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CONTACT")
    private Long id;

    @Column(name = "DES_CONTACT_NAME")
    private String contactName;

    @Column(name = "DES_CONTACT_PHONE")
    private String phone;

    @Column(name = "DES_CONTACT_CELLPHONE")
    private String cellphone;

    @Column(name = "DES_CONTACT_EMAIL")
    private String email;

    @Column(name = "NAM_CONTACT_COMPLEMENT")
    private String contactTypeComplement;

    @ManyToOne
    @JoinColumn(name = "ID_STUDENT")
    @ToString.Exclude
    @JsonIgnore
    private Student student;

}
