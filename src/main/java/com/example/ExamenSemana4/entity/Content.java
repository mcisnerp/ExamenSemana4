package com.example.ExamenSemana4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Content")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private Integer duration;

    public Content() {
    }

    public Content(String name, String description, Integer duration) {
        this.name = name;
        this.description = description;
        this.duration = duration;
    }

}
