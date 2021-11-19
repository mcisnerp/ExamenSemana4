package com.example.ExamenSemana4.repository;

import com.example.ExamenSemana4.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {
    List<Student> findStudentByName(String name);

    @Query(value= "Select s from Student s join s.expedientList e where s.name=:name")
    List<Student> findExpedientByNameStudent(String name);

    List<Student> findStudentByDni(Integer dni);
}
