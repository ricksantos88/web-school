package com.web.school.domain.entities.student;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Entity
@Table(name = Responsible.TABLE_NAME)
public class Responsible {

    protected static final String TABLE_NAME = "RESPONSIBLE";

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_RESPONSIBLE")
    private Long id;

    @Column
    private String name;

    @Column
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "ID_STUDENT")
    @ToString.Exclude
    @JsonIgnore
    private Student student;

}
