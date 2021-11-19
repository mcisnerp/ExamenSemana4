package com.example.ExamenSemana4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Expedient")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Expedient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Date enrollmentDate;
    private Integer score;
    private Date endDate;
    @ManyToOne(cascade = {CascadeType.ALL})
    private Course course;

    public Expedient(Date enrollmentDate, Integer score, Date endDate, Course course) {
        this.enrollmentDate = enrollmentDate;
        this.score = score;
        this.endDate = endDate;
        this.course = course;
    }

    public Expedient() {
    }
}
