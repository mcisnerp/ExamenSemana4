package com.example.ExamenSemana4.controller;

import com.example.ExamenSemana4.entity.Student;
import com.example.ExamenSemana4.exception.InexistenteException;
import com.example.ExamenSemana4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return ResponseEntity.ok(student);
    }

    @GetMapping("/allstudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("/updateStudent")
    public ResponseEntity<String> updateStudent(@RequestBody Student student) throws InexistenteException {
        if (studentService.findStudentByDni(student.getDni()).isEmpty()){
            throw new InexistenteException("Student not found");
        }
        studentService.updateStudent(student);
        return ResponseEntity.ok("Actualizacion exitosa");
    }

    @DeleteMapping("/deleteStudent")
    public ResponseEntity<Student> deleteStudent(@RequestBody Student student) {
        studentService.deleteStudent(student);
        return ResponseEntity.ok(student);
    }

    @GetMapping("/studentbyname/{name}")
    public ResponseEntity<List<Student>> findStudentByName(@PathVariable String name) throws InexistenteException {
        List<Student> listStudent = studentService.findStudentByName(name);
        if (listStudent.isEmpty()) {
            //String body="Student not found";
            throw new InexistenteException("Student not found");
        }
        return ResponseEntity.ok(listStudent);
    }


    @GetMapping("/expedientbystudent/{name}")
    public ResponseEntity<List<Student>> findExpedientByNameStudent(@PathVariable String name) throws InexistenteException {
        List<Student> studentList =studentService.findExpedientByNameStudent(name);
        if (studentList.isEmpty()){
            throw new InexistenteException("Expedient not found");
        }
        return ResponseEntity.ok(studentList);
    }
}
