package com.example.ExamenSemana4.repository;

import com.example.ExamenSemana4.entity.Course;
import com.example.ExamenSemana4.entity.Expedient;
import org.springframework.data.repository.CrudRepository;

public interface ExpedientRepository extends CrudRepository<Expedient,Integer> {
    void deleteExpedientByCourse(Course course);
}
