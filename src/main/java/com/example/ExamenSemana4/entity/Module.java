package com.example.ExamenSemana4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Module extends Content {
    private Integer id;

    @OneToMany(cascade = {CascadeType.ALL})
    @Column(name = "contentList")
    private List<Content> contentList;

    @Override
    public Integer getDuration() {
        return super.getDuration();
    }

    public Module() {
    }
}
