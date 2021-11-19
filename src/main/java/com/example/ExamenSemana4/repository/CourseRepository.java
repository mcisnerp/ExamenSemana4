package com.example.ExamenSemana4.repository;

import com.example.ExamenSemana4.entity.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,Integer> {
    /*@Query(value = "Select * from maestros where nombre=:nombre and edad=:edad",nativeQuery = true)
    List<Teacher> findTeacherByNameAndAgePorQuerynNativa(String nombre, Integer edad);
    @Query(value= "Select t from Teacher t join t.cursoList c where c.nombre=:nombre")
    List<Teacher> findTeacherByCurso(String nombre);

*/
    @Query(value = "Select sum(con.duration) from Course c join c.contentList con where c.id=:id")
    String getCourseDuration(Integer id);

    @Query(value = "Select c.name from Course c where c.id=:id")
    String getNameOfCourseById(Integer id);
}
