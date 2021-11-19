package com.example.ExamenSemana4.service;

import com.example.ExamenSemana4.entity.Student;
import com.example.ExamenSemana4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }

    public List<Student> findStudentByName(String name) {
        return studentRepository.findStudentByName(name);
    }

    public List<Student> findExpedientByNameStudent(String name) {
        return studentRepository.findExpedientByNameStudent(name);
    }

    public List<Student> findStudentByDni(Integer dni) {
        return studentRepository.findStudentByDni(dni);
    }
}
