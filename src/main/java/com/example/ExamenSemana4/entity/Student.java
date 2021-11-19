package com.example.ExamenSemana4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Student")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer dni;
    private String name;
    private String lastName;
    private String address;
    private String email;
    @OneToMany(cascade = {CascadeType.ALL})
    @Column(name = "expedientList")
    private List<Expedient> expedientList;

    public Student(String name, String lastName, String address, String email, List<Expedient> expedientList) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.expedientList = expedientList;
    }

    public Student() {
    }
}
