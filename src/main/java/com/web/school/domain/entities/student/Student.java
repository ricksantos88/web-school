package com.web.school.domain.entities.student;

import com.web.school.domain.entities.Address;
import com.web.school.domain.entities.BaseModel;
import com.web.school.domain.entities.Contact;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.*;

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

    @Column
    private String cpf;

    @OneToOne(mappedBy = "student", cascade = ALL, fetch = EAGER, orphanRemoval = true)
    private Address address;

    @OneToMany(mappedBy = "student", cascade = ALL, fetch = EAGER, orphanRemoval = true)
    private Set<Responsible> responsibles;

    @OneToMany(mappedBy = "student", cascade = ALL, fetch = EAGER, orphanRemoval = true)
    private Set<Contact> contacts;

    public Student addResponsible(Responsible responsible) {
        if (responsible == null) {
            return this;
        }
        responsible.setStudent(this);
        this.responsibles.add(responsible);
        return this;
    }

    public Student addContact(Contact contact) {
        if (contact == null) {
            return this;
        }
        contact.setStudent(this);
        this.contacts.add(contact);
        return this;
    }

    public Student setStudentAddress(Address address) {
        if (address == null) {
            return this;
        }
        address.setStudent(this);
        this.address = address;
        return this;
    }

}
